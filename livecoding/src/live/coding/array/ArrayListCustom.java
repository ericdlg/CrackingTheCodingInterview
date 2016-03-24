package live.coding.array;

import java.util.Arrays;

class ArrayListCustom<E> {

    private static final int INITIAL_CAPACITY = 10;
    private Object elementData[]={};
    private int size = 0;

    /**
     * constructor.
     */
    public ArrayListCustom() {
        elementData = new Object[INITIAL_CAPACITY];
    }

    /**
     * method adds elements in ArrayListCustom.
     */
    public void add(E e) {
        if (size == elementData.length) {
            ensureCapacity(); //increase current capacity of list, make it double.
        }
        elementData[size++] = e;
    }


    /**
     * method returns element on specific index.
     */
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if ( index <0 || index>= size) {  //if index is negative or greater than size of size, we throw Exception.
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elementData[index]; //return value on index.
    }


    /**
     * method returns removedElement on specific index.
     * else it throws IndexOutOfBoundException if index is negative or greater than size of size.
     */
    public Object remove(int index) {
        if ( index <0 || index>= size) {  //if index is negative or greater than size of size, we throw Exception.
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }

        Object removedElement=elementData[index];
        for(int i=index;i<size;i++){
            elementData[i]=elementData[i+1];
        }
        size--;   //reduce size of ArrayListCustom after removal of element.

        return removedElement;
    }


    /**
     * method increases capacity of list by making it double.
     */
    private void ensureCapacity() {
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }

    /**
     * method displays all the elements in list.
     */
    public void display() {
        System.out.print("Displaying list : ");
        for(int i=0;i<size;i++){
            System.out.print(elementData[i]+" ");
        }
    }

    static public void main(String args[]) {
        ArrayListCustom<Integer> list = new ArrayListCustom<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);

        list.display();
        System.out.println("\nelement at index "+1+" = "+list.get(1));
        System.out.println("element removed from index "+1+" = "+list.remove(1));

        System.out.println("\nlet's display list again after removal at index 1");

        list.display();
    }

}


package live.coding.set;

import live.coding.map.MyHashMap;

class LinkedHashSetCustom<E>{

    private MyHashMap<E, Object> myHashMap;

    public LinkedHashSetCustom(){
        myHashMap =new MyHashMap<>();
    }

    /**
     * add objects in LinkedHashSetCustom.
     */
    public void add(E value){
        myHashMap.put(value, null);

    }

    /**
     * Method returns true if LinkedHashSetCustom contains the object.
     */
    public boolean contains(E obj){
        return myHashMap.contains(obj) !=null ? true :false;
    }

    /**
     * Method displays all objects in LinkedHashSetCustom.
     * insertion order is not guaranteed, for maintaining insertion order refer LinkedHashSet.
     */
    public void display(){
        myHashMap.displaySet();
    }

    /**
     * Method removes object from setCustom.
     * insertion order is not guaranteed, for maintaining insertion order refer LinkedHashSet.
     * @param obj
     */
    public boolean remove(E obj){
        return myHashMap.remove(obj);
    }

    public static void main(String[] args) {
        LinkedHashSetCustom<Integer> linkedHashSetCustom = new LinkedHashSetCustom<Integer>();
        linkedHashSetCustom.add(21);
        linkedHashSetCustom.add(25);
        linkedHashSetCustom.add(30);
        linkedHashSetCustom.add(33);
        linkedHashSetCustom.add(35);

        System.out.println("LinkedHashSetCustom contains 21 ="+linkedHashSetCustom.contains(21));
        System.out.println("LinkedHashSetCustom contains 51 ="+linkedHashSetCustom.contains(51));

        System.out.print("Displaying LinkedHashSetCustom: ");
        linkedHashSetCustom.display();

        System.out.println("\n\n21 removed: "+linkedHashSetCustom.remove(21));
        System.out.println("22 removed: "+linkedHashSetCustom.remove(22));

        System.out.print("Displaying LinkedHashSetCustom: ");
        linkedHashSetCustom.display();
    }
}

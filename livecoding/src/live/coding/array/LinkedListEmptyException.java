package live.coding.array;

class LinkedListEmptyException extends RuntimeException{
    public LinkedListEmptyException(){
        super();
    }

    public LinkedListEmptyException(String message){
        super(message);
    }
}

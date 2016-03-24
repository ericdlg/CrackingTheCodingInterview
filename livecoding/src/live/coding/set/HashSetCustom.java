package live.coding.set;

import live.coding.map.MyHashMap;

class HashSetCustom<E>{

    private MyHashMap<E, Object> myHashMap;

    public HashSetCustom(){
        myHashMap =new MyHashMap<>();
    }

    /**
     * add objects in SetCustom.
     */
    public void add(E value){
        myHashMap.put(value, null);
    }

    /**
     * Method returns true if set contains the object.
     */
    public boolean contains(E obj){
        return myHashMap.contains(obj) !=null ? true :false;
    }

    /**
     * Method displays all objects in setCustom.
     * insertion order is not guaranteed, for maintaining insertion order refer LinkedHashSet.
     */
    public void display(){
        myHashMap.displaySet();
    }

    /**
     * Method removes object from setCustom.
     */
    public boolean remove(E obj){
        return myHashMap.remove(obj);
    }

}
package Tamrin4;

import java.util.Arrays;

public class CustomHashMap<K,V> {
    private Cell<K,V> [] table;
    private int capacity = 20;

    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        table = new Cell[capacity];
    }


    public CustomHashMap() {
        table = new Cell[capacity];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomHashMap<?, ?> that = (CustomHashMap<?, ?>) o;
        return capacity == that.capacity && Arrays.equals(table, that.table);
    }

  /*  @Override
    public int hashCode() {
        int result = Objects.hash(capacity);
        result = 31 * result + Arrays.hashCode(table);
        return result;
    }*/
    public void put(K key,V value){
        int index = index(key);
        Cell<K, V> cell=new Cell<>(key,value,null);
        if(table[index] == null) {
            table[index] = cell;
        }
        else {
            Cell<K, V> previCell=null;
            Cell<K, V> currentSell=table[index];
            if(currentSell.getKey().equals(key)){
                currentSell.setValue(value);
                break;
            }
            previCell = currentSell;
            currentSell = currentSell.getNext();

        if(previCell != null)
            previCell.setNext(cell);}
    }




    private int index(K key){
        if(key == null){
            return 0;
        }
        return Math.abs(key.hashCode() % capacity);
    }

        }


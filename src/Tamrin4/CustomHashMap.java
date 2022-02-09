package Tamrin4;

import java.util.Arrays;

public class CustomHashMap<K, V> {
    private Cell<K, V>[] table;
    private int capacity = 20;
    private int size;

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
    public void put(K key, V value) {
        int index = index(key);
        Cell<K, V> cell = new Cell<>(key, value, null);
        if (table[index] == null) {
            table[index] = cell;
        } else {
            Cell<K, V> previCell = null;
            Cell<K, V> currentSell = table[index];
            if (currentSell.getKey().equals(key)) {
                currentSell.setValue(value);
                size++;
                return;
            }
            previCell = currentSell;
            currentSell = currentSell.getNext();

            if (previCell != null)
                previCell.setNext(cell);
        }
    }

    public V get(K key) {
        V value = null;
        int index = index(key);
        Cell<K, V> cell = table[index];
        while (cell != null) {
            if (cell.getKey().equals(key)) {
                value = cell.getValue();
                break;
            }
            cell = cell.getNext();
        }
        return value;
    }

    public boolean Isget(K key) {
        V value = null;
        int index = index(key);
        Cell<K, V> cell = table[index];
        while (cell != null) {
            if (cell.getKey().equals(key)) {
                return true;
            }
            cell = cell.getNext();
        }
        return false;
    }

    public void show() {
        for (Cell c : table
        ) {
            System.out.println(c);

        }
    }

    public boolean isEmpety() {
        if (size == 0)
            return true;
        else
            return false;
    }


    private int index(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % capacity);
    }

}


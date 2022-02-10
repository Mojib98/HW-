package Tamrin4;

public class Cell<K,V>{

    private K key;
    private V value;
    private Cell<K, V> next;

    public Cell(K key, V value, Cell<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Cell<K, V> getNext() {
        return next;
    }

    public void setNext(Cell<K, V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

package HW9.MyHashMapPack_old;

public class NodeHashMap <K, V> {

    public K key;
    public V value;
    public NodeHashMap next;

    public NodeHashMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "NodeHashMap{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}

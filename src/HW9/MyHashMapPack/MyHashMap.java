package HW9.MyHashMapPack;

import java.util.Arrays;

public class MyHashMap<K, V> {

    private NodeHashMap<K, V>[] hashMapArray = new NodeHashMap[10];

    public void put(K key, V value) {
        increasingArrayVolume(key);
        int index = key.hashCode();

        hashMapArray[index] = new NodeHashMap(key, value);
    }

    private void increasingArrayVolume(K key) {
        int arrayLength = hashMapArray.length;
        int index;
        index = key.hashCode() + 1;
        if (arrayLength - 1 < index) {
            hashMapArray =  Arrays.copyOf(hashMapArray, index);
        }
    }

    public void clear() {
        this.hashMapArray = new NodeHashMap[10];
    }


    public int size() {
        int size = 0;

        for (Object elem:
                hashMapArray) {
            if (elem != null) {
                size++;

            }
        }
        return size;
    }


//remove(Object key) видаляє пару за ключем

public void remove(K key) {
        int index = key.hashCode();
        hashMapArray[index] = null;

}
//get(Object key) повертає значення (Object value) за ключем

    public V get(K key) {
        int index = key.hashCode();
        return hashMapArray[index].value;
    }


    @Override
    public String toString() {
        return
                "MyHashMap{" +
                "hashMapArray=" + Arrays.toString(hashMapArray) +
                '}';
    }
}

package HW9;


import java.util.Arrays;

public class MyArrayList<T> {

    private Object[] content = new Object[10];

//    creating own method add() :

    public void add(T addedElement) {
        increasingArrayVolume();
        content[this.size()] = addedElement;
//        size++;
    }


//    creating own method  remove() :

    public void remove(int index) {
//        content[index] = null;
        for (int i = index; i < content.length - 1; i++) {
            content[i] = content[i + 1];
        }
        content[content.length - 1] = null;

    }

//    creating own method to increase a volume of array:
    private void increasingArrayVolume() {
        if (content.length - 1 == this.size()) {
           content =  Arrays.copyOf(content, content.length + 3);
        }
    }

//    creating own method to clear array:

    public void clear() {
        this.content = new Object[10];
    }

//    creating own method size()

    public int size() {
        int size = 0;
        for (Object elem:
             content) {
            if (elem != null) size ++;
        }
        return size;
    }

    //    method get() for MyArrayList:

    public T get(int index) {
        return (T) content[index];
    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "content=" + Arrays.toString(content) +
                ", size=" + content.length +
                '}';
    }
}



package HW9;

import java.util.Arrays;

public class MyQueue<E> {

    private Object[] queueArray = new Object[10];


    //    add(Object value) додає елемент в кінець
    public void add(E addedElement) {
        if (addedElement == null) return;

        increasingArrayVolume();
        queueArray[this.size()] = addedElement;


    }

    private void increasingArrayVolume() {
        if (queueArray.length - 1 == this.size()) {
            queueArray =  Arrays.copyOf(queueArray, queueArray.length + 3);
        }
    }

//clear() очищає колекцію

    public void clear() {
        this.queueArray = new Object[0];
    }


//size() повертає розмір колекції
    public int size() {
        int size = 0;

        for (Object elem:
                queueArray) {
        if (elem != null) size ++;
        }
    return size;
    }



//peek() повертає перший елемент з черги

    public E peek() {
        Object firstEl = queueArray[0];
        return (E) firstEl;
    }

//poll() повертає перший елемент з черги і видаляє його з колекції

    public E poll() {
        Object firstEl = queueArray[0];
        if(this.size() > 1) {
            for (int i = 0; i < queueArray.length - 1; i++) {

                queueArray[i] = queueArray[i + 1];
            }
            queueArray[queueArray.length - 1] = null;
        }
        return (E) firstEl;

    }


    @Override
    public String toString() {
        return "MyQueue{" +
                "queueArray=" + Arrays.toString(queueArray) +
                '}';
    }
}

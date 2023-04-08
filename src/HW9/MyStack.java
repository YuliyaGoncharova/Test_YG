package HW9;

import java.util.Arrays;

public class MyStack<E> {


    private Object[] stackArray = new Object[10];

//    int sizeOfStack = 0;



    //    add(Object value) реалізувати ЛІФО
//    to verify if array[0] != null
//    if null, we can write new value to array[0]
//    if array[0] != null, then [0} to [1], [1] -> [2] etc. Then write new value to [0];
//    public void addToCreateStack(E addedElement) {
    public void add(E addedElement) {
//        if (addedElement == null) return;
        increasingArrayVolume();

            for (int i = stackArray.length - 1; i > 0; i--) {
                stackArray[i] = stackArray[i - 1];
            }
            stackArray[0] = addedElement;
//        }

//        sizeOfStack++;
    }

    private void increasingArrayVolume() {
//        if (stackArray.length - 1 == sizeOfStack) {
        if (stackArray.length - 1 == this.size()) {
            stackArray =  Arrays.copyOf(stackArray, stackArray.length + 3);
        }
    }


    //    push(Object value) додає елемент в кінець

    public void push(E value) {
//        if (value == null) return;
////        для варіанта коли не може бути пустих елементів всередині
//        increasingArrayVolume();
//        stackArray[this.size()] = value;

 //        для варіанта коли можуть  бути пусті елементи всередині

        increasingArrayVolume();
        int indexForNotNullEl = this.size();
        for (int i = this.size(); i > 0; i--) {
            if(stackArray[i] != null) {
                indexForNotNullEl = i;
                break;
            }

        }
        stackArray[indexForNotNullEl + 1] = value;

    }


//remove(int index) видаляє елемент за індексом
    public void remove(int index) {
    //        content[index] = null;
        for (int i = index; i < stackArray.length - 1; i++) {
            stackArray[i] = stackArray[i + 1];
        }
        stackArray[stackArray.length - 1] = null;
    
    }

//clear() очищає колекцію

    public void clear() {
        this.stackArray = new Object[0];
    }


//size() повертає розмір колекції
    public int size() {
        int size = 0;

        for (Object elem:
                stackArray) {
            if (elem != null) {
                size++;

            }
        }
        return size;
    }


//peek() повертає перший елемент стеку

    public E peek() {
        Object firstEl = stackArray[0];
        return (E) firstEl;
    }

//pop() повертає перший елемент стеку та видаляє його з колекції

    public E pop() {
        Object firstEl = stackArray[0];
        if(this.size() > 1) {
            for (int i = 0; i < stackArray.length - 1; i++) {

                stackArray[i] = stackArray[i + 1];
            }
            stackArray[stackArray.length - 1] = null;
        }
        return (E) firstEl;

    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stackArray=" + Arrays.toString(stackArray) +
                '}';
    }
}

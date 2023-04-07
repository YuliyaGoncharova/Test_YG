package HW9;


import java.util.Arrays;

public class MyArrayList<MA> {

    private Object[] content = new Object[10];
    private int size = 0;

//    creating own method add() :

    public void add(MA addedElement) {
        increasingArrayVolume();
        content[size] = addedElement;
        size++;
    }


//    creating own method  remove() :

    public void remove(int index) {
        content[index] = null;
    }

//    creating own method to increase a volume of array:
    private void increasingArrayVolume() {
        if (content.length - 1 == size) {
           content =  Arrays.copyOf(content, content.length + 3);
        }
    }

//    creating own method to clear array:
//    для кожного елемента за індексом в масиві - видалити цей елемент масиву): content[index]. While

    public void clear() {
        for (int i = 0; i < content.length; i++) remove(i);
    }

//    creating own method size()

    public int size() {
        return content.length;
    }

    //    method get() for MyArrayList:

    public MA get(int index) {
        return (MA) content[index - 1];
    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "content=" + Arrays.toString(content) +
                ", size=" + content.length +
                '}';
    }
}



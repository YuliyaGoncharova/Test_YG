package HW9;

public class MyLinkedList<T> {

    public MyLinkedList() {
    }

    Node first;  //null

    Node getLast() {
        Node item = first;
        while (item.getNext() != null) {
            item = item.getNext();
        }

        return item;
    }

    Node getFirst() {
        return first;
    }

    public void add(T itemValue) {
        Node newItem = new Node(itemValue);
        if (this.first != null) {
            this.getLast().setNext(newItem);
        } else {
            this.first = newItem;
        }
    }

    // remove(int index) видаляє елемент із вказаним індексом
    public void remove(int index) {
//        щоб видалити елемент лінкед листа , потрібно знайти його в листі. тобто включаємо рахівничку і рахуємо не нульові елементи.
//        як тільки доходимо до рахівничка == індексу, перевизначаємо звʼязки превʼюс і некст
        if(index < 0 || index >= this.size()) return;
        if(index == 0) {
            this.first = this.first.getNext();
        }
        else {
            Node<T> beforeDeleted = this.getNodeByIndex(index - 1);
            Node<T> afterDeleted = this.getNodeByIndex(index + 1);
            beforeDeleted.setNext(afterDeleted);
            }
        }


    public int size() {
        Node item = first;
        int size = 0;
        while (item != null) {
            size++;
            item = item.getNext();
        }
        return size;
    }

    public void clear() {
        this.first = null;
    }

    public T get(int index) {
        Node<T> item = first;
        int counter = 0;
        while (item.getNext() != null) {
            if (counter == index) {
                return item.value;
            }
            counter++;
            item = item.getNext();
        }

        return null;
    }

    public Node<T> getNodeByIndex(int index) {
        Node<T> item = first;
        int counter = 0;
        while (item.getNext() != null) {
            if ( counter == index) {
                return item;
            }
            counter ++;
            item = item.getNext();
        }

        return null;
    }

    @Override
    public String toString() {

        StringBuilder toPrint = new StringBuilder();

        for (Node x = getFirst(); x != null; x = x.getNext()) {
            toPrint = toPrint.append(x.value + ",  ") ;
        }

        return String.valueOf(toPrint);


    }
}

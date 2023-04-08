package HW9;



public class Node<T> {
    public T value;
//    private Node prev;
    private Node next;


//    public Node getPrev() {
//        return prev;
//    }

//    public void setPrev(Node prev) {
//        this.prev = prev;
//    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
//        next.prev = this;
        this.next = next;
    }

    public Node(T item) {
        this.value = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
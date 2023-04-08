package HW9;

import java.util.LinkedList;
import java.util.Queue;

public class TestStarter {

    public static void main(String[] args) {

//    myArrTest();
//    myLinkedListTest();
//        myQueueTest();
        myStackTest();

    }

//    public static void myArrTest()
//    public static void myQueueTest()
    public static void myStackTest()
    {

//        MyArrayList<String> myArr = new MyArrayList<>();
//        MyQueue<String> myArr = new MyQueue<>();
        MyStack<String> myArr = new MyStack<>();


        myArr.add("yg1");
        myArr.add("yg2");
//        myArr.add("yg3");
        myArr.add(null);
        myArr.add("yg4");
        myArr.add("yg5");
        myArr.add("yg6");
        myArr.add("yg");
        myArr.add("yg8");
        myArr.add("yg");
        myArr.add("yg10");
        myArr.add("yg11");
        myArr.add("yg12");
        myArr.add("yg13");
        myArr.add("yg14");
        myArr.add("yg15");

        System.out.println(myArr);
//        System.out.println(myArr.peek());
//        System.out.println(myArr.poll());


        System.out.println(myArr.size());

//        System.out.println(myArr.get(4));

//        myArr.remove(4);

//        System.out.println(myArr);

        myArr.push("yg22");
        myArr.push("23");
        myArr.push("24");
        myArr.push("25");
        System.out.println(myArr);

        System.out.println(myArr.size());

//        myArr.clear();
//
        myArr.add("yg44");
        System.out.println(myArr);

        System.out.println(myArr.size());
        System.out.println(myArr.peek());
        System.out.println(myArr.pop());
        System.out.println(myArr);

//        System.out.println(myArr.size());
    }



    public static void myLinkedListTest() {
        MyLinkedList<String> myLL = new MyLinkedList<>();

        myLL.add("yg1");
        myLL.add("yg2");
//        myLL.add(null);
        myLL.add("yg3");
        myLL.add("yg4");
        myLL.add("yg5");
        myLL.add("yg6");
        myLL.add("yg7");
        myLL.add("yg8");
        myLL.add("yg9");
        myLL.add("yg10");
        myLL.add("yg11");
        myLL.add("yg12");
        myLL.add("yg13");
        myLL.add("yg14");
        myLL.add("yg15");

//        System.out.println(myArr.size());

        System.out.println(myLL.getNodeByIndex(11));
        System.out.println(myLL);

//        myLL.clear();

        myLL.remove(11);

        System.out.println(myLL);

//        System.out.println(myLL.size());
    }




}

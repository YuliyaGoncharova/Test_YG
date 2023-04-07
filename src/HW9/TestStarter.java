package HW9;

public class TestStarter {

    public static void main(String[] args) {

    myArrTest();

    }

    public static void myArrTest() {

        MyArrayList<String> myArr = new MyArrayList<>();
        myArr.add("yg1");
        myArr.add("yg2");
        myArr.add("yg3");
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

        System.out.println(myArr.size());

        System.out.println(myArr.get(11));
        System.out.println(myArr);

        myArr.clear();

        System.out.println(myArr);

        System.out.println(myArr.size());
    }

//    public static void removing() {
//
//    }
}

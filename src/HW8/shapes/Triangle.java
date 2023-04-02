package HW8.shapes;

public class Triangle implements Shape{

    private String name = "TRIANGLE";

    Point dot1, dot2, dot3;

    public Point getDot1() {
        return dot1;
    }

    public Point getDot2() {
        return dot2;
    }

    public Point getDot3() {
        return dot3;
    }

    public Triangle(Point dot1, Point dot2, Point dot3) {
        this.dot1 = dot1;
        this.dot2 = dot2;
        this.dot3 = dot3;
    }


    @Override
    public String shapeName() {
        return name;
    }

    @Override
    public String toString() {
        return "It is " + name + " with dots: " +
                "dot1=" + dot1 +
                ", dot2=" + dot2 +
                ", dot3=" + dot3;
    }
}

package HW8.shapes;

public class Rectangle implements Shape{

    private String name = "RECTANGULAR";

    private Point dot1, dot2;

    public Rectangle(Point dot1, Point dot2) {
//        this.name = name;
        this.dot1 = dot1;
        this.dot2 = dot2;
    }

    @Override
    public String shapeName() {
        return name;
    }

    @Override
    public String toString() {

        Point dot3 = new Point(dot1.getX(), dot2.getY());
        Point dot4 = new Point(dot2.getX(), dot1.getY());
        return "It is " + name + " with dots: " +
                 dot1 + ", " +
                 dot3 + ", " +
                 dot2 + ", " +
                 dot4 + ".";
    }
}

package HW8.shapes;

public class Circle implements Shape {

    private String name = "CIRCLE";
    private Point point;
    private int radius;

    public Point getPoint() {
        return point;
    }

    public int getRadius() {
        return radius;
    }

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }



    @Override
    public String toString() {
        return "It is " + name + " with central point " + point +
                ", and radius=" + radius;
    }

    @Override
    public String shapeName() {
        return name;
    }
}

package HW8.shapes;

public class Star implements Shape{

    private String name = "STAR";

    private Point centralDot;
    private int vector;

    public Star(Point centralDot, int vector) {
        this.centralDot = centralDot;
        this.vector = vector;
    }

    @Override
    public String shapeName() {
        return name;
    }
}

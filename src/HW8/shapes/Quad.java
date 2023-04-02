package HW8.shapes;

public class Quad extends Rectangle {
    public Quad(Point dot1, Point dot2) {
        super(dot1, dot2);
    }

    private String name = "QUAD";

    @Override
    public String shapeName() {
        return name;
    }
}

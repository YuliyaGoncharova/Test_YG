package HW8;

import HW8.printers.FigureArrayPrinter;
import HW8.printers.FigureConsolePrinter;
import HW8.printers.FigurePrinter;
import HW8.shapes.*;

public class AppStarter {

    public static void main(String[] args) {

        doLogic();
    }

    public static void doLogic(){
        Shape[] shapes = getFigures();
        printFigures(shapes, new FigureConsolePrinter());
    }

    public static Shape[] getFigures(){

        Circle circle1 = new Circle(new Point(27, 88), 56);
        Triangle triangle1 = new Triangle(new Point(1,2), new Point(3,4), new Point(5,6));
        Rectangle rectangle1 = new Rectangle(new Point(1,2), new Point(9,10));
        Star star1 = new Star(new Point(3,4), 15);
        Quad quad1 = new Quad(new Point(3,5), new Point(10, 7));
        Star star2 = new Star(new Point(198,99), 22);


        Shape[] shA = {circle1, triangle1, star2, rectangle1, star1, quad1};

        return shA;
    }

    public static void printFigures(Shape[] sa, FigurePrinter fp){
        FigureArrayPrinter asd = new FigureArrayPrinter();
        asd.printFiguresUsingFigurePrinter(sa, fp);
    }
}

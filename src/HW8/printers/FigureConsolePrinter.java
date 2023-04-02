package HW8.printers;

import HW8.shapes.Shape;

public class FigureConsolePrinter implements FigurePrinter {
    @Override
    public void print(Shape sh) {
        System.out.println(sh.shapeName());
    }
}
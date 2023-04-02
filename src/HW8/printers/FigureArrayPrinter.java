package HW8.printers;

import HW8.shapes.Shape;

public class FigureArrayPrinter {
    public void printFiguresUsingFigurePrinter(Shape[] sa, FigurePrinter fp){
        for (Shape s : sa) {
            fp.print(s);
        }
    }
}

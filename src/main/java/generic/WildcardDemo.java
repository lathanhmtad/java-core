package generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        // ?
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Circle(1));
        shapes.add(new Circle(1));
        printSize(shapes);

        // ? extends T
        List<Circle> newShapes = new LinkedList<>();
        newShapes.add(new Circle(1));
        newShapes.add(new Circle(2));
        printArea(newShapes);

        // ? super T
    }

    public static void printSize(List<?> shapes) {
        System.out.println(shapes.size());
    }

    public static void printArea(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle = " + shape.area());
            } else if (shape instanceof Square) {
                System.out.println("Square = " + shape.area());
            }
        }
    }

}

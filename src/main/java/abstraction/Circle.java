package abstraction;

public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}

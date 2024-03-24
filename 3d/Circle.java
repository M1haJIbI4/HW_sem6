// Класс круга, реализующий TwoDimensionalShape
public class Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
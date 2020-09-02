package day9.Task2;

public class Triangle extends Figure {
    private double lengthSideA;
    private double lengthSideB;
    private double lengthSideC;
    public Triangle(double lengthSideA, double lengthSideB, double lengthSideC, String color) {
        super(color);
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
        this.lengthSideC = lengthSideC;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - lengthSideA) - (halfPerimeter - lengthSideB) - (halfPerimeter - lengthSideC));

    }

    @Override
    public double perimeter() {
        return lengthSideA + lengthSideB + lengthSideC;
    }
}
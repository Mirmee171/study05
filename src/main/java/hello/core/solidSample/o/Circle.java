package hello.core.solidSample.o;

public class Circle implements Shape {

    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

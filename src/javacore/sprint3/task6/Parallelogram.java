package javacore.sprint3.task6;

public abstract class Parallelogram implements Figure {
    private final double a;
    private final double b;

    Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }

}

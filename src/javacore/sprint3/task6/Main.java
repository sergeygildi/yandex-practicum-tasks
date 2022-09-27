package javacore.sprint3.task6;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        getPrintln("Площадь прямоугольника 4см * 6см = ", rectangle.getArea());

        Square square = new Square(3);
        getPrintln("Площадь квадрата 3см * 3см = ", square.getArea());

        Rhombus rhombus = new Rhombus(4, 3);
        getPrintln("Площадь ромба со стороной 4см и высотой 3см = ", rhombus.getArea());

        Circle circle = new Circle(2);
        getPrintln("Площадь круга с радиусом 2см = ", circle.getArea());
    }

    private static void getPrintln(String x, double figureArea) {
        System.out.println(x + figureArea);
    }

}

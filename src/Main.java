public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 50);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
        Square square = new Square(10);
        System.out.println("Area of square: " + square.getArea());
        System.out.println("Perimeter of square: " + square.getPerimeter());
    }
}
class Rectangle {
    protected double length;
    protected double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

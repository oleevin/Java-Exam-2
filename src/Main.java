public class Rectangle {
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

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

        public static void main(String[] args) {
            Rectangle rec = new Rectangle(10, 50);
            System.out.println("Area rec : " + rec.getArea());
            System.out.println("Peri rec: " + rec.getPerimeter());
            Square squ = new Square(10);
            System.out.println("Area squ: " + squ.getArea());
            System.out.println("Peri squ: " + squ.getPerimeter());
        }
}


/*Develop inheritance,Polymorphism with method overriding for shape object with sub types
  Rectangle,square,Circle with the operation findArea().*/
class Shape {
    void findArea() {
        System.out.println("find area common implementation from class Shape");
    }
}

class Rectangle extends Shape {
    private double l;
    private double b;     /* Thank you */

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void findArea() {
        double area = l * b;
        System.out.println("Rectangle Area : " + area);
    }
}

class Square extends Shape {
    private double s;

    public Square(double s) {
        this.s = s;
    }

    void findArea() {
        double area = s * s;
        System.out.println("Square Area : " + area);
    }
}

class Circle extends Shape {
    private static final double PI = 3.141;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    void findArea() {
        double area = PI * r * r;
        System.out.println("Circle Area : " + area);
    }
}

class Painter {
    public static void main(String... args) {
        Shape shape;

        shape = new Rectangle(10, 20);
        System.out.println("======================");
        shape.findArea();

        shape = new Square(10);
        System.out.println("======================");
        shape.findArea();

        shape = new Circle(10);
        System.out.println("======================");
        shape.findArea();
        System.out.println("======================");
    }
}
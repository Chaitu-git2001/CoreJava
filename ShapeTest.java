
abstract class Shape {
    abstract double area();
}


class Rectangle extends Shape {
    private double length;
    private double breadth;

    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    
    @Override
    double area() {
        return length * breadth;
    }
}


class Circle extends Shape {
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}


public class ShapeTest {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(5, 10);
        Circle circ = new Circle(7);

        
        System.out.println("Rectangle Area = " + rect.area());
        System.out.printf("Circle Area = %.2f\n", circ.area());  // formatted to 2 decimals
    }
}

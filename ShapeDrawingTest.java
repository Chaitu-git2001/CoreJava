abstract class Shape {
    abstract void draw();  // abstract method
}
class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}

public class ShapeDrawingTest {
    public static void main(String[] args) {
        
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(5, 10);

        
        circle.draw();
        rectangle.draw();
    }
}

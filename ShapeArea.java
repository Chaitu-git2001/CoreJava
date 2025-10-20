class ShapeArea {

    public int calculateArea(int side) {
        return side * side;
    }

    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        ShapeArea sa = new ShapeArea();

        
        System.out.println("Square Area = " + sa.calculateArea(5));
        System.out.println("Rectangle Area = " + sa.calculateArea(4, 6));
        System.out.printf("Circle Area = %.2f\n", sa.calculateArea(3));
    }
}

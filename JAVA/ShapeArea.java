import java.util.Scanner;

class Shape {
    public double getArea(double length, double breadth) {
        // area of rectangle
        return length * breadth;
    }

    public double getArea(double side) {
        // area of square
        return side * side;
    }

    public double getArea(int radius) {
        // area of circle
        return Math.PI * (radius * radius);
    }

}

class ShapeArea {
    public static void main(String args[]) {
        Shape shape = new Shape();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the shape\n1.Rectangle\n2.Square\n3.Circle");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter the length :");
                double length = scanner.nextDouble();
                double breadth = scanner.nextDouble();
                System.out.println("Area of rectangle=" + shape.getArea(length, breadth));
                break;
            case 2:
                System.out.println("Enter side:");
                double side = scanner.nextDouble();
                System.out.println("Area of rectangle=" + shape.getArea(side));
                break;
            case 3:
                System.out.println("Enter the radius");
                int radius = scanner.nextInt();
                System.out.println("Area of circle=" + shape.getArea(radius));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
import java.util.Scanner;

interface Calculate {
    double getArea();

    double getPerimeter();
}

class Circle implements Calculate {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Calculate {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return length * breadth;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * (length + breadth);
    }
}

public class InterFaceDemo {
    public static void main(String[] args) {
        int op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Circle\n2.Recatangle\nChoose the shape:");
        op = scanner.nextInt();
        switch (op) {
            case 1:
                System.out.println("Enter radius:");
                int radius = scanner.nextInt();
                Circle circle = new Circle(radius);
                System.out.println("Area:" + circle.getArea());
                System.out.println("Perimeter:" + circle.getPerimeter());
                break;
            case 2:
                System.out.println("Enter length");
                int length = scanner.nextInt();
                System.out.println("Enter breadth:");
                int breadth = scanner.nextInt();
                Rectangle rectangle = new Rectangle(length, breadth);
                System.out.println("Area:" + rectangle.getArea());
                System.out.println("Perimeter:" + rectangle.getPerimeter());
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}

import graphics.*;
import java.util.Scanner;
public class GraphicsDemo {
    public static void main(String[] args) {
        int radius,length,breadth,side,height;
        double area;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter radius:");
        radius=scanner.nextInt();
        Circle circle=new Circle(radius);
        area=circle.area();
        System.out.println("Area of circle="+area);
        System.out.println("Enter length of rectangle:");
        length=scanner.nextInt();
        System.out.println("Enter breadth of rectangle:");
        breadth=scanner.nextInt();
        Rectangle rectangle=new Rectangle(length, breadth);
        area=rectangle.area();
        System.out.println("Area of rectangle="+area);
        System.out.println("Enter side of the square:");
        side=scanner.nextInt();
        Square square=new Square(side);
        area=square.area();
        System.out.println("Area of square="+area);
        System.out.println("Enter height of triangle:");
        height=scanner.nextInt();
        System.out.println("Enter breadth of triangle:");
        breadth=scanner.nextInt();
        Triangle triangle=new Triangle(height, breadth);
        area=triangle.area();
        System.out.println("Area of Triangle="+area);
    }
}

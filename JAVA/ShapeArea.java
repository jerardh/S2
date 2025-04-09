import java.util.Scanner;

class Shape{
    public double Area(double length,double breadth){
        return length*breadth;
    }

    public double Area(double side){
        return side*side;
    }

    public double Area(int radius){
        return Math.PI*(radius*radius);
    }
    
}

class ShapeArea{
    public static void main(String args[]){
        Shape s= new Shape();
        Scanner sc=new Scanner(System.in);

        System.out.println("Select the shape\n1.Rectangle\n2.Square\n3.Circle");
        int sh=sc.nextInt();
        switch (sh) {
            case 1:
                System.out.println("Enter the length ");
                
                break;
        
            default:
                break;
        }
    }
}
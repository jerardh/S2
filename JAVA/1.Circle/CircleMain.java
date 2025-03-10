import java.util.Scanner;
class Circle{
   int radius;
   Circle(int r){
    radius=r;
   }
   double getArea(){
    return 3.14*radius*radius;
   } 
}
class CircleMain {
   public static void main(String[] args){
        Circle c1=new Circle(5);
        System.out.println("Area of the circle="+c1.getArea());
   } 
}
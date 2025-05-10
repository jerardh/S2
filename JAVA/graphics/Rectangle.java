package graphics;

public class Rectangle implements Figure{
    double length;
    double breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double area() {
        return length*breadth;
    }
}

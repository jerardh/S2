package graphics;
public class Circle implements Figure{
    double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
}

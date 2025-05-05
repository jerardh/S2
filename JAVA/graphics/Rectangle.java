package graphics;

public class Rectangle implements Figure{
    double length;
    double breadth;
    @Override
    public double area() {
        return length*breadth;
    }
}

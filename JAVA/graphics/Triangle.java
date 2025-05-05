package graphics;

public class Triangle implements Figure {
    double breadth;
    double height;
    public Triangle(double height,double breadth){
        this.height=height;
        this.breadth=breadth;
    }
    @Override
    public double area() {
        // TODO Auto-generated method stub
        return 0.5*breadth*height;
    }
}

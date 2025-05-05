package graphics;

public class Square implements Figure{
    double a;
    public Square(double a){
        this.a=a;
    }
    @Override
    public double area() {
        // TODO Auto-generated method stub
        return a*a;
    }
}

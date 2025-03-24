class Complex {
    float real;
    float img;

    Complex(float real, float img) {
        this.real = real;
        this.img = img;
    }

    float getReal() {
        return real;
    }

    float getImg() {
        return img;
    }

    Complex addComplex(Complex c2) {
        float resReal = this.getReal() + c2.getReal();
        float resImag = this.getImg() + c2.getImg();
        Complex c3 = new Complex(resReal, resImag);
        return c3;
    }

    void display() {
        System.out.println(real + "+" + img + "i");
    }

}

public class ComplexAddition {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 6);
        Complex c2 = new Complex(2, 54);
        Complex c3 = c1.addComplex(c2);
        System.out.println("Inputs");
        c1.display();
        c2.display();
        System.out.println("Result");
        c3.display();
    }
}

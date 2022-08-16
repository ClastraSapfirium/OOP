package HW_1;

public class Square extends Shape {
    Point a;
    double s;
    
    public Square(Point x, double s, Colour clr) {
        a=x;
        this.s=s;
        cl = clr;
    }
    public double area(){
        return Math.pow(s,2);
    }
    @Override
    public String toString() {
        return String.format("Квадрат стороной %d, цвета %s", Math.round(s), cl);
    }
}
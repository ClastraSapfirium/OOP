package HW_1;

public class Circle extends Shape{
    Point a;
    double r;
    
    public Circle(Point x, double r, Colour clr) {
        a=x;
        this.r=r;
        cl = clr;
    }
    public double area(){
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public String toString() {
        return String.format("Круг радиусом %d, цвета %s", Math.round(r), cl);
    }
}
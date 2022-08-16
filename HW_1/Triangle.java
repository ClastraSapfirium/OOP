package HW_1;

public class Triangle extends Shape{
    Point a;
    Point b;
    Point c;
    
    //Colour cl;
    /**
     * Конструктор треугольника
     * @param x - точка в двумерном пространстве а
     * @param y - точка в двумерном пространстве b
     * @param z - точка в двумерном пространстве c
     */
    public Triangle(Point x, Point y, Point z, Colour clr) {
        a=x;
        b=y;
        c=z;
        cl = clr;
    }
    public void Set(Point a, Point b, Point c, Colour cl){
        this.a=a;
        this.b=b;
        this.c=c;
        this.cl=cl;
    }
    public double area(){
        // формула Герона
        double p = 0;
        p=0.5*(Point.distance(a, b) + Point.distance(b, c) + Point.distance(a, c));
        return Math.sqrt(p*(p-Point.distance(a, c))*(p-Point.distance(a, b))*(p-Point.distance(b, c)));
    }
    @Override
    public String toString() {
        return String.format("Треугольник площадью %d, цвета %s", Math.round(area()), cl);
    }
}
package HW_2;
public class Triangle extends ShowFigure{

    public Triangle(Point a, Point b, Colour colour) {
        super(a, b, colour);
    }

    @Override
    public String Shape() {
        return "Треугольник";
    }

    @Override
    public double Sqere() {
        double triangleSide = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double square = Math.pow(triangleSide, 2) * Math.sqrt(3) / 4;
        return square;
    }
}
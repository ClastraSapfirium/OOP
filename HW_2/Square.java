package HW_2;
public class Square extends ShowFigure{

    public Square(Point a, Point b, Colour colour) {
        super(a, b, colour);
    }

    @Override
    public String Shape() {
        return "Квадрат";
    }

    @Override
    public double Sqere() {
        double squareSide = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double square = Math.pow(squareSide, 2);
        return square;
    }        
}   
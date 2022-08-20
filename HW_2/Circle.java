package HW_2;
public class Circle extends ShowFigure {

    public Circle(Point a, Point b, Colour colour) {
        super(a, b, colour);
    }

    @Override
    public String Shape() {
            return "Круг";
    }

    @Override
    public double Sqere() {
            double diameter = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
            double square = (Math.PI)*(Math.pow(diameter, 2)/4);
            return square;
    }



   


}
package HW_2;
public abstract class ShowFigure implements Prop{
    protected Point a;
    protected Point b;
    protected Colour colour;

    public ShowFigure(Point a, Point b, Colour colour) {
        this.a = a;
        this.b = b;
        this.colour = colour;
    }

    @Override
    public String toString() {
        
        return String.format("Фигура: %s, Цвет: %s, Площадь: %f\n", Shape(), colour, Sqere());
    }
}
package HW_2;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void findMaxSqere(ShowFigure[] arr) {
        double max = arr[0].Sqere();
        ShowFigure ShowFigureMax = arr[0];
        for (int i = 1; i < arr.length; i++ ) {
            if (arr[i].Sqere() >= max) {
                max = arr[i].Sqere();
                ShowFigureMax = arr[i];
            }
        }
        System.out.printf("\nФигура с максимальной площадью: %s, цвет: %s\n", ShowFigureMax.Shape(), ShowFigureMax.colour);
    }

    public static void printAllShowFigures(ShowFigure[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Фигура: %s, Цвет: %s, Площадь: %f\n", arr[i].Shape(), arr[i].colour, arr[i].Sqere());
        }
    }

    public static void maxSquare(List<ShowFigure> list ) {
        double max = list.get(0).Sqere();
        ShowFigure maxShowFigure = list.get(0); 
        for(ShowFigure item : list) {
            if (item.Sqere() >= max) {
                max = item.Sqere();
                maxShowFigure = item;
            }
        }
        System.out.printf("\nМаксикальная площадь %f у фигуры: %s, цвета %s\n\n", max, maxShowFigure.Shape(), maxShowFigure.colour );
    }
    public static void main(String[] args) {
        
        ShowFigure ShowFigureOne = new Square(new Point(0),new Point(4), Colour.RED);
        ShowFigure ShowFigureTwo = new Triangle(new Point(0),new Point(1, 2), Colour.AQUA);
        ShowFigure ShowFigureThree = new Circle(new Point(0),new Point(1), Colour.BLUE);
        ShowFigure ShowFigureFour = new Circle(new Point(0),new Point(3), Colour.GREEN);
        ShowFigure ShowFigureFive = new Triangle(new Point(0),new Point(4, 3), Colour.BLACK);
        ShowFigure ShowFigureSix = new Square(new Point(0),new Point(3,2), Colour.BLUE);

        List<ShowFigure> ls = Arrays.asList(ShowFigureOne,ShowFigureTwo, ShowFigureThree, ShowFigureFour, ShowFigureSix, ShowFigureFive);

        maxSquare(ls);
        System.out.println(ls);

    }
}
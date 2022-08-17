package HW_1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(0,0);
        Point b = new Point(2,3);
        Point c = new Point(9,5);
                
        if(!checkPoint(a,b,c)){
            System.out.println("По заданным точкам невозможно построить треугольник, круг и квадрат!");
            System.exit(1);
        }
        
        Triangle tr1=new Triangle(a, b, c, Colour.MAGENTA);
        Square sq1 = new Square(b,5,Colour.BLACK);
        Circle crl1 = new Circle(c,15,Colour.AQUA);
        List<Shape> ls = Arrays.asList(tr1,crl1,sq1);
        System.out.println("Набор представлен следующими фигурами: " + "\n" + ls);
        System.out.println("Максимальная площадь: " + Math.round(maxSquare(ls)));
        System.out.println(maxFigure(ls));
    }
    
    public static Shape maxFigure(List<Shape> ls1){
        Shape sh = ls1.get(0);
        
        double max = sh.area();
        for (Shape item : ls1) {
            if(item.area()>max) {
                max=item.area();
                sh = item;
            }
        }
        return sh;
    }
    
    public static double maxSquare(List<Shape> ls1){
        
        double max = ls1.get(0).area();
        for (Shape item : ls1) {
            if(item.area()>max) max=item.area();
        }
        return max;
    }
    public static boolean checkPoint(Point x, Point y, Point z){
        if(((z.getX()-x.getX())*(y.getY()-x.getY()))!=((y.getX()-x.getX())*(z.getY()-x.getY()))){ 
            return true;
        }
        return false;
    }
}
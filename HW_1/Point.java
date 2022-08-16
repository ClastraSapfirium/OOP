package HW_1;

public class Point {
    private int x,y;


    public Point(int valueX, int valueY) {  
    x = valueX;
    y = valueY;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public static double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
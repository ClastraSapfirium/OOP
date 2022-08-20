package HW_2;
public class Point {
    
    private int x, y;
    
    public Point(int valueX, int valueY) {
        this.x = valueX;
        this.y = valueY;
    }
    
    public Point(int value) {
        this(value, value);
    }
    
    public Point() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
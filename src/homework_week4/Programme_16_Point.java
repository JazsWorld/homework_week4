package homework_week4;
/**
 * You have to represent a point in 2D space
 */

import java.awt.*;

public class Programme_16_Point {
    public static void main(String[] args) {
        Programme_16_Point first = new Programme_16_Point(6, 5);
        Programme_16_Point second = new Programme_16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance(0,0));
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance(0,0));
    }
    private int x = 0;
    private int y = 0;

    public Programme_16_Point() {

    }

    public Programme_16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(Programme_16_Point another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }


}

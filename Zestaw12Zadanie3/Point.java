package Zestaw12Zadanie3;

public class Point {
    int x, y;
    
    static Point getPoint(int x, int y){
        Point point = new Point();
        point.x = x;
        point.y = y;
        return point;
    }
}

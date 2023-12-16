package Zestaw12Zadanie3;

public class Rect {
    Point ul;
    Point br;
    static Rect getRect(Point ull, int w, int h){
        Rect rect = new Rect();
        rect.ul = ull;
        rect.br = Point.getPoint(ull.x + w, ull.y - h);
        return rect;
    }

    static Rect getContainingRect(Point[] arr){

        int xmax = arr[0].x;
        int xmin = arr[0].x;
        int ymax = arr[0].y;
        int ymin = arr[0].y;
        
        for(int i = 1; i< arr.length; i++){
            if(arr[i].x>xmax)
                xmax = arr[i].x;
            if(arr[i].x<xmin)
                xmin = arr[i].x;
            if(arr[i].y>ymax)
                ymax = arr[i].y;
            if(arr[i].y<ymin)
                ymin = arr[i].y;
        }

        Rect containing = new Rect();
        containing.ul = Point.getPoint(xmin, ymax);
        containing.br = Point.getPoint(xmax, ymin);
        return containing;
    }
    void showInfo(){
        System.out.println("UL=(" + ul.x + ", " + ul.y + ") BR=("+br.x + ", " + br.y+")");
    }
}

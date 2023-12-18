package Zestaw14Zadanie1;

public class Square {
    final double bok;

    public Square(double bok){
        this.bok = bok;
    }

    public double getBok(){
        return bok;
    }

    public double getPrzekatna(){
        return Math.sqrt(2*bok*bok);
    }

    public double getObwod(){
        return 4*bok;
    }

    public double getPole(){
        return bok*bok;
    }

    public static Square fun(Square sqrt1, Square sqrt2){
        Square sqrt3 = new Square(Math.sqrt(sqrt1.getPole() + sqrt2.getPole()));
        return sqrt3;
    }

}

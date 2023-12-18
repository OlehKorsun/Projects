package Zestaw14Zadanie1;

public class Main {
    public static void main(String[] args) {
        Square sqrt = new Square(10);
        System.out.println(sqrt.getBok());
        System.out.println(sqrt.getPrzekatna());
        System.out.println(sqrt.getObwod());
        System.out.println(sqrt.getPole());


        Square sqrt1 = new Square(3);
        Square sqrt2 = new Square(4);
        System.out.println(Square.fun(sqrt1, sqrt2).getBok());

    }
}

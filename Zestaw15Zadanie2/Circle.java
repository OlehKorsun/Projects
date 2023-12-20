package Zestaw15Zadanie2;

public class Circle {
    private double promien;
    public Circle(double promien){
        this.promien = promien;
    }
    public double getRadius(){
        return this.promien;
    }
    public double getArea(){
        return Math.PI*this.promien*this.promien;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.promien;
    }
    public String toString(){
        return "Promien = " + this.promien;
    }

    public Square getInscribedSquare(){
        Square square1 = new Square(Math.sqrt(2*this.promien*this.promien));
        return square1;
    }
    public Square getCircumscribedSquare(){
        Square square2 = new Square(2*this.promien);
        return square2;
    }

    public Circle(Square square){
        this.promien = Math.sqrt(square.getArea()/Math.PI);
    }



    public static Square[] getSquares(Circle[]  arr){
        Square[] tabl = new Square[arr.length];

        for(int i = 0; i<tabl.length; i++){
            tabl[i] = new Square(arr[i]);
        }

        return tabl;
    }
}

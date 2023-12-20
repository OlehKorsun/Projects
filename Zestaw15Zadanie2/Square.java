package Zestaw15Zadanie2;

public class Square {
    private double bok;
    public Square(double bok){
        this.bok = bok;
    }
    public double getSide(){
        return this.bok;
    }
    public double getArea(){
        return this.bok*this.bok;
    }
    public double getPerimeter(){
        return this.bok*4;
    }
    public String toString(){
        return "[Bok = " + this.bok;
    }

    public Circle getInscribedCircle(){
        Circle circle1 = new Circle(this.bok/2);
        return circle1;
    }
    public Circle getCircumscribedCircle(){
        Circle circle2 = new Circle(Math.sqrt(2*this.bok*this.bok)/2);
        return circle2;
    }

    public Square(Circle circle){
        this.bok = Math.sqrt(circle.getArea());
    }

    public static Circle[] getCircles(Square[] arr){
        Circle[] tabl = new Circle[arr.length];
        for(int i = 0; i<tabl.length; i++){
            tabl[i] = new Circle(arr[i]);
        }
        return tabl;
    }
}

package Zestaw14Zadanie2;

public class Square {
    private double side;

    public Square(){
        this.side = 1;
    }

    public Square(double side){
        this.side = side;
    }

    public String toString(){
        return "Square: bok = " + side;
    }

    public double getSide(){
        return side;
    }

    public double getArea(){
        return side*side;
    }

    public double getDiagonal(){
        return Math.sqrt(2*side*side);
    }

    public double getPerimeter(){
        return side*4;
    }

    public Square getDoubled(){
        Square sqrt2 = new Square(side*2);
        return sqrt2;
    }

    public static double getTotalArea(Square[] sqs){
        double sum = 0;
        for(Square sqrt: sqs)
            sum+= sqrt.getArea();
        return sum;
    }

    public static Square getMax(Square[] sqs){
        Square max = sqs[0];
        for(Square sqrt: sqs) {
            if (sqrt.getSide() > max.getSide())
                max = sqrt;
        }
        return max;
    }
}

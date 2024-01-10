package Zestaw17Zadanie3;

public class Calculator extends CalculatingDevice{
    public Calculator(){}
    public Calculator(String nazwa){
        super(nazwa);
    }
    public String Calculate(double x, double y){
        return super.Calculate(x,y) + " ; " + x + " - " + y + " = " + (x-y);
    }
}

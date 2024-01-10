package Zestaw17Zadanie3;
import java.io.*;

public class Computer extends Calculator{
    public Computer(){}

    public Computer(String nazwa){
        super(nazwa);
    }
    public String Calculate(double x, double y){
        return super.Calculate(x,y) + " ; " + x + " * " + y + " = " + (x*y) + " ; " + x + " / " + y + " = " + (x/y);
    }
}

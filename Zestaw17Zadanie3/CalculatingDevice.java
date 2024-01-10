package Zestaw17Zadanie3;

public class CalculatingDevice {
    String nazwa;

    public CalculatingDevice(){}

    public CalculatingDevice(String nazwa){
        this.nazwa = nazwa;
    }

    public String Calculate(double x, double y){
        return nazwa + " " + x + " + " + y + " = " + (x+y);
    }

    public static void printRes(CalculatingDevice[] a, double x, double y){
        for(CalculatingDevice el: a)
            System.out.println(el.Calculate(x,y));
    }
}

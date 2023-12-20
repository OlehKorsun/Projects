package Zestaw14Zadanie3;

public class Temperature {
    private double t;

    public Temperature(double t, char ch){
        if(ch=='C')
            this.t = t;
        else if(ch=='F')
            this.t = 5./9*(t-32);
        else
            this.t = t-273.15;
    }

    public double getInC(){
        return this.t;
    }
    public double getInF(){
        return 9./5*this.t + 32;
    }
    public double getInK(){
        return this.t+273.15;
    }

}

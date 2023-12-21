package Zestaw20TomaszewskiZadanie5;

public class Spawacz extends Osoba {
    private int stazpracy;

    public Spawacz(String name, int staz){
        super(name);
        this.stazpracy = staz;
    }

    public String toString(){
        return "Name: " + super.getName() + ", staz pracy: " + this.stazpracy;
    }
}

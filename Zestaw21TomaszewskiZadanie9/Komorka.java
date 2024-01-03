package Zestaw21TomaszewskiZadanie9;

public class Komorka extends Telefon{
    String[] tabl = new String[10];
    public Komorka(){}
    public Komorka(String interfejs, String color){
        super(interfejs, color);
    }

    public void wyswietHistoriePolaczen(){
        for(String el: tabl)
            System.out.print("[" + el + "]  ");
    }
}

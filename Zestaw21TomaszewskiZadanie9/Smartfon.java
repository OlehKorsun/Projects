package Zestaw21TomaszewskiZadanie9;

import java.util.Arrays;

public class Smartfon extends Komorka {
    Osoba[] znajomi = new Osoba[10];
    int i = 0;
    public Smartfon(){
        
    }
    public Smartfon(String interfejs, String color, String name, String nazwisko, String numer){
        super(interfejs, color);
        Osoba osoba = new Osoba(name, nazwisko, numer);
        if(i<znajomi.length){
            this.znajomi[i] = osoba;
            i++;
        }
        else {
            this.znajomi = Arrays.copyOf(this.znajomi, this.znajomi.length*2);
            this.znajomi[i] = osoba;
            i++;
        }
    }
    
    public void wyswietHistoriePolaczen(){
        for(int j = 0; j<i; j++)
            System.out.println(znajomi[j].imie + " " + znajomi[j].nazwisko + " " + znajomi[j].numer);
    }
}

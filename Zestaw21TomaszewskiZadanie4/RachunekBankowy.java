package Zestaw21TomaszewskiZadanie4;

public class RachunekBankowy {
    Osoba wlasciciel;
    double stan;
    public RachunekBankowy(){}
    public RachunekBankowy(Osoba osoba, double stan){
        this.wlasciciel = osoba;
        this.stan = stan;
    }
    public void wplata(double kwota){
        this.stan += kwota;
    }
    public void wyplata(double kwota){
        this.stan -= kwota;
    }

    public void przelew(RachunekBankowy rachunek,double kwota){
        this.stan -= kwota;
        rachunek.stan += kwota;
    }
}

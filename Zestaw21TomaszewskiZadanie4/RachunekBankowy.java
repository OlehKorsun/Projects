package Zestaw21TomaszewskiZadanie4;

public class RachunekBankowy {
    Osoba wlasciciel;
    double stan;
    public RachunekBankowy(){}
    public RachunekBankowy(Osoba osoba, double stan){
        this.wlasciciel = osoba;
        this.stan = stan;
    }
    public void wplata(double kwota) throws BlendnaOperacja{
        if(kwota<0)
            throw new BlendnaOperacja("Zbyt mala kwota");
        this.stan += kwota;
    }
    public void wyplata(double kwota) throws BlendnaOperacja{
        if(kwota<0 || kwota>this.stan)
            throw new BlendnaOperacja("Blad");
        this.stan -= kwota;
    }

    public void przelew(RachunekBankowy rachunek,double kwota) throws BlendnaOperacja{
//        if(kwota<=0){
//            throw new BlendnaOperacja("Nieprawidlowa kwota");
//        }
//        if(this.stan<kwota){
//            throw new BlendnaOperacja("Nie wystarcza srodkow na koncie");
//        }
        if(kwota<0 || this.stan<kwota)
            throw new BlendnaOperacja("Blad");
        this.stan -= kwota;
        rachunek.stan += kwota;
    }

//    void blad(double kwota, double stan) throws BlendnaOperacja{
//        if(kwota<0 || kwota>stan)
//            throw new BlendnaOperacja("Blad!");
//    }

    public String toString() {
        return "Osoba: " + wlasciciel.name + ", stan: " + this.stan;
    }
}

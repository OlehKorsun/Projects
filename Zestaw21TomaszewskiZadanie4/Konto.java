package Zestaw21TomaszewskiZadanie4;

public 
    class Konto 
    extends RachunekBankowy{
        double oprocentowanie;
        public Konto(){}
        public Konto(Osoba osoba, double stan, double procent){
            super(osoba, stan);
            this.oprocentowanie = procent;
    }

}

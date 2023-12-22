package Zestaw20TomaszewskiZadanie6;

public class PojazdKolowy extends Pojazd {
    private int iloscOsi;
    public PojazdKolowy(){}
    public PojazdKolowy(int ilosc, String name){
        super(name);
        this.iloscOsi = ilosc;
    }

    public int getIloscOsi(){
        return this.iloscOsi;
    }
}

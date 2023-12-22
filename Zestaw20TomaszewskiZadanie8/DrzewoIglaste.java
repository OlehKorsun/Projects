package Zestaw20TomaszewskiZadanie8;

public class DrzewoIglaste extends Drzewo{
    int iloscIgiel;
    double dlugoscSzyszki;

    public DrzewoIglaste(){}
    public DrzewoIglaste(String name, int ilosc, double dlugosc){
        super(name);
        this.iloscIgiel = ilosc;
        this.dlugoscSzyszki = dlugosc;
    }

    public String toString(){
        return "Drzewo: " + super.name + ", ilosc igiel: " + this.iloscIgiel + ", dlugosc szyszki: " + this.dlugoscSzyszki;
    }
}

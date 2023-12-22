package Zestaw20TomaszewskiZadanie8;

public class DrzewoOwocowe extends DrzewoLisciaste{
    String nazwaOwoca;
    public DrzewoOwocowe(){}
    public DrzewoOwocowe(String name, int ksztalt, String nazwa){
        super(name, ksztalt);
        this.nazwaOwoca = nazwa;
    }

    public String toString(){
        return "Drzewo: " + super.name + ", kstalt liscia: " + super.ksztaltLiscia + ", nazwa owoca: " + this.nazwaOwoca;
    }
}

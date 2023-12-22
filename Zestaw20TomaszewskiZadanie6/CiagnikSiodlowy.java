package Zestaw20TomaszewskiZadanie6;

public class CiagnikSiodlowy extends PojazdKolowy{
    int masa;
    public CiagnikSiodlowy(String name, int il, int masa){
        super(il, name);
        this.masa = masa;
    }

    public String rozpocznijJazde(){
        if(this.masa/super.getIloscOsi()>11)
            return "Jazda niebiezpieczna, odmowa!";
        else
            return "Zgoda!";
    }
}

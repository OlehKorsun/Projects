package Zestaw21TomaszewskiZadanie3;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Owoc[] tabl = new Owoc[100];
        double ogolnaMasa = 0;
        int jablko = 0;
        int gruszka = 0;
        int pomarancza = 0;

        for(int i = 0; ogolnaMasa<5000; i++){
           tabl[i] = Drzewo.zerwijOwoc();
           ogolnaMasa += tabl[i].getMasa();
           if(tabl[i].getNazwa().equals("Jablko"))
               jablko++;
           else if(tabl[i].getNazwa().equals("Pomarancza"))
               pomarancza++;
            else
                gruszka++;
        }
        System.out.println(Arrays.toString(tabl));
        System.out.println("Jablek: " + jablko);
        System.out.println("Pomarancz: " + pomarancza);
        System.out.println("Gruszek: " + gruszka);
    }
}

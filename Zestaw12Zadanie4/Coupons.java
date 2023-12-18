package Zestaw12Zadanie4;

public class Coupons {
    public static void main(String[] args) {
        final int N = 30;                              // rodzaje kuponow
        final int NUM_OF_SIMULATIONS = 100000;
        int totalBoxes = 0;
        for(int i = 0; i<NUM_OF_SIMULATIONS; ++i){
            totalBoxes += boxesBought(N);
        }
        double aver = totalBoxes/(double)NUM_OF_SIMULATIONS;

        System.out.println("N = " + N);
        System.out.println("pudelka = " + aver);
        System.out.println("Harmo = " + harmo(N));
    }

    static int boxesBought(int coupons){
        int liczbaPudelek = 0;
        int[] kupony = new int[coupons];

            while (czyWszystkieKupony(kupony)) {
                int rand = (int) (Math.random() * coupons);
                kupony[rand] = 1;
                liczbaPudelek++;

            }
            return liczbaPudelek;
        }

    public static boolean czyWszystkieKupony(int[] tabl){
            for(int elem: tabl){
                if(elem==0)
                    return true;
            }
            return false;
        }

    static double harmo(int n){
        double sum = 0;
        for(int i = 1; i<=n; ++i){
            sum += 1.0/i;
        }
        return sum*n;
    }
}

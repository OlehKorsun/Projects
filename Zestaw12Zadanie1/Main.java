package Zestaw12Zadanie1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] tabl = {
                {3, 2, 6, 1, 3, 5, 6, 1, 3},
                {3, 1, 2, 1, 5, 7, 2},
                {8, 9, 2, 1}
        };
        print(tabl);
    }
    public static void print(int[][] tabl){
        for(int i = 0; i<tabl.length; i++){
            System.out.println(Arrays.toString(tabl[i]));
        }
    }
    public static void selSort(int[] tabl){
    }
}

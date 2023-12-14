package Zestaw12Zadanie2;

import java.util.Arrays;

public class Arr2DJagger {
    public static void main(String[] args) {
        int[][] arr = { {1, 3}, {3, 4, 5, 8}, {6, 8}, {9} };
        System.out.println(Arrays.toString(getAverages(arr)));
    }

    public static double[] getAverages(int[][] tabl){
        double[] tabl2 = new double[tabl.length];
        for(int i = 0; i<tabl.length; i++){
            int sum = 0;
            int il = 0;
            for(int j = 0; j<tabl[i].length; j++){
                sum+=tabl[i][j];
                il++;
            }
            tabl2[i] = sum/il;

        }
        return tabl2;
    }
}

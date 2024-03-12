public class MAD {
    public static void main(String[] args) {
        double res = 0;
        final int ILOSC = 10000000;
        for(int i = 0; i<ILOSC; ++i){
            double sum1 = (Math.random()*10);
            double sum2 = (Math.random()*11);
            if(sum1<sum2)
                res += sum1;
            else
                res += sum2;
        }
        System.out.println(res/ILOSC);
    }
}

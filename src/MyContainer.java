public class MyContainer {
    static int weight;
    int value;
    double value2;

    public void fun(int a, int b, double c){
        weight = a;
        this.value = b;
        this.value2 = c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}

public class Main{
    public static void main(String[] args) {
        MyContainer cont = new MyContainer();
        MyContainer cont2 = new MyContainer();

        cont.fun(5, 10, 25.5);
        cont2.fun(20, 30, 40.5);
        System.out.println(cont.weight);
        
    }
}

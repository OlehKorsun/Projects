package Zestaw17Zadanie3;

public class Main {
    public static void main(String[] args) {
        CalculatingDevice cal1 = new CalculatingDevice("pierwszy");
        System.out.println(cal1.Calculate(1, 4));


        CalculatingDevice[] arr = {
                new Computer("Cray"),
                new CalculatingDevice("Abacus"),
                new Calculator("HP")
        };
        CalculatingDevice.printRes(arr, 21, 7);

    }
}

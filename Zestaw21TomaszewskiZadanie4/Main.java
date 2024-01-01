package Zestaw21TomaszewskiZadanie4;

public class Main {
    public static void main(String[] args) throws BlendnaOperacja {
        Osoba os1 = new Osoba("Katarzyna");
        Osoba os2 = new Osoba("Michal");

        RachunekBankowy rach1 = new RachunekBankowy(os1, 100);
        RachunekBankowy rach2 = new RachunekBankowy(os2, 500);

        rach1.przelew(rach2, 50);
        rach1.wplata(200);
        System.out.println(rach1);
        System.out.println(rach2);
    }
}

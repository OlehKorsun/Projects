package Zestaw20TomaszewskiZadanie6;

public class Main {
    public static void main(String[] args) {
        CiagnikSiodlowy pojazd1 = new CiagnikSiodlowy("Bob", 2, 10);
        System.out.println(pojazd1.rozpocznijJazde());

        CiagnikSiodlowy pojazd2 = new CiagnikSiodlowy("Jym", 2, 30);
        System.out.println(pojazd2.rozpocznijJazde());
    }
}

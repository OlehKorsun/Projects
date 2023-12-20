package Zestaw20TomaszewskiZadanie3;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person pers1 = new Person("Jessika", 2000);
        Person pers2 = new Person("Bob", 2003);
        Person pers3 = new Person("Maria");
        Person pers4 = new Person("Dean", 1999);

//        System.out.println(pers1);
//        System.out.println(pers2);
//        System.out.println(pers3);
//        System.out.println(pers4);

        Person[] tabl = {pers1, pers2, pers3, pers4};

        System.out.println(Person.getOlder(pers1, pers2));
        System.out.println(Person.getOldest(tabl));

        System.out.println(Arrays.toString(Person.sortowanie(tabl)));
    }
}
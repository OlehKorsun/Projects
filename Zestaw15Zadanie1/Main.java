package Zestaw15Zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("3 childrens will be created");
        Child[] tabl = new Child[3];

        for(int i = 0; i<3; i++){
            System.out.print("Name of the child no " + i + ": " );
            Scanner scan = new Scanner(System.in);
            String a = scan.nextLine();
            tabl[i] = new Child(a);
        }
        System.out.print("3 childrens: " );
        Child.printChildren(tabl);
        System.out.println("Entering the name of the 'given' starting with 'q' terminates the program");

        System.out.print("Enter names of 'giver' and 'receiver': ");
        Scanner scan = new Scanner(System.in);
        String name1 = scan.next();
        String name2 = scan.next();
        Child child1;
        Child child2;

        while(!(name1.startsWith("q"))){

            child1 = Child.getChildByName(tabl, name1);
            child2 = Child.getChildByName(tabl, name2);

            if(child1==null || child2==null)
                continue;

            child1.givesCandyTo(child2);
        }
        return;
    }
}

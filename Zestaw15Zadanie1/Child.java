package Zestaw15Zadanie1;


public class Child {
    private String name;
    private int numCandies;

    Child(String name){
        this.name = name;
        this.numCandies = 2;
    }

    void givesCandyTo(Child other){
        if(this.numCandies<1){
            System.out.println("No candies to give!");
            return;
        }
        this.numCandies--;
        other.numCandies++;
    }

    static Child getChildByName(Child[] children, String name){
        for(int i = 0; i<children.length; i++){
            if(children[i].name.equals(name))
                return children[i];
        }
        return null;
    }

    static void printChildren(Child[] children){
        System.out.print("[ ");
        for(int i = 0; i<children.length; i++){
            System.out.print("(" + children[i].name + ", " + children[i].numCandies + " candies)");
        }
        System.out.println(" ]");
    }

}

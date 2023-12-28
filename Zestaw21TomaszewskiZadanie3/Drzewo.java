package Zestaw21TomaszewskiZadanie3;

public class Drzewo {
    public static Owoc zerwijOwoc(){
        int a = (int)(Math.random()*3);
        Owoc owoc;
        
        switch(a){
            case 0 -> owoc = new Jablko();
            case 1 -> owoc = new Pomarancza();
            case 2 -> owoc = new Gruszka();
        }
        return owoc;
    }
}

package Zestaw21TomaszewskiZadanie3;

public class Drzewo {
    public static Owoc zerwijOwoc(){
        int a = (int)(Math.random()*3);
        Owoc owoc;
        if(a==0)
            owoc = new Jablko();
        else if(a==1)
            owoc = new Pomarancza();
        else
            owoc = new Gruszka();
        return owoc;
    }
}

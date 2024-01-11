package Zestaw21TomaszewskiZadanie9;

public class Telefon {
    
    String interfejsKomunikacyjny;
    String color;
    public Telefon(){}
    public Telefon(String interfejs, String color){
        this.interfejsKomunikacyjny = interfejs;
        this.color = color;
    }
    public void zadzwon(String numer){
        System.out.println(numer);
    }
    public void wyswietHistoriePolaczen(){
        System.out.println("Brak historii");
    }
}

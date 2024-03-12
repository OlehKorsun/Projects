public class Prostokat {
    protected int szerokosc;
    protected int wysokosc;
    public Prostokat(){}
    public Prostokat(int szerokosc, int wysokosc){
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public void rysuj() throws ProstokatException {
        System.out.println("Zwykly prostokat rozmairu " + this.szerokosc + " x " + this.wysokosc);
        if(this.wysokosc<1 || this.szerokosc<1)
            throw new ProstokatException();
    }
}

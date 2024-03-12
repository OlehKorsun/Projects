public class ZProstokat extends Prostokat{
    protected char brzeg;
    protected char wewnatrz;
    protected int indeks;
    protected String nazwa;
    static int i_prostokat = 1;
    static int i_kwadrat = 1;
    public ZProstokat(){}
    public ZProstokat(int wysokosc, int szerokosc, char wewnatrz, char brzeg){
        super(wysokosc, szerokosc);
        this.brzeg = brzeg;
        this.wewnatrz = wewnatrz;
        if(wysokosc==szerokosc) {
            this.indeks = i_kwadrat;
            i_kwadrat++;
            this.nazwa = "Kwadrat";
        } else {
            this.indeks = i_prostokat;
            i_prostokat++;
            this.nazwa = "Prostokat";
        }
    }
    public ZProstokat(int liczba, char wewnatrz, char brzeg){
        this(liczba, liczba, brzeg, wewnatrz);
    }

    public void rysuj() throws ProstokatException{
        if(this.szerokosc>0 && this.wysokosc>0){
            if(this.szerokosc>=3 && this.wysokosc>=3){

                System.out.println(this.nazwa + " ("+this.indeks+")"+ " rozmiaru "+ this.szerokosc + "x" + this.wysokosc + ", " + this.brzeg+"=" + (this.szerokosc*2+this.wysokosc*2-4) + ", " + this.wewnatrz + "=" +((this.szerokosc-2)*(this.wysokosc-2)));

                for(int i = 1; i<=this.wysokosc; i++){
                    if(i==1 || i==this.wysokosc){
                        for(int j = 1; j<=this.szerokosc; j++){
                            System.out.print(this.brzeg);
                        }
                        System.out.println();
                    } else {
                        System.out.print(this.brzeg);
                        for(int j = 1; j<=this.szerokosc-2; j++){
                            System.out.print(this.wewnatrz);
                        }
                        System.out.println(this.brzeg);
                    }
                }

            }
            else {

                if(this.brzeg == this.wewnatrz) {
                    System.out.println(this.nazwa + " ("+this.indeks+")"+ " rozmiaru "+ this.szerokosc + "x" + this.wysokosc + ", " + this.brzeg + "=" + (this.wysokosc*this.szerokosc));
                    for (int i = 1; i <= this.wysokosc; i++) {
                        for (int j = 1; j <= this.szerokosc; j++) {
                            System.out.print(this.brzeg);
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println(this.nazwa + " ("+this.indeks+")"+ " rozmiaru "+ this.szerokosc + "x" + this.wysokosc);
                    throw new ProstokatException();
                }
            }
        } else throw new ProstokatException();
        System.out.println();
    }
}

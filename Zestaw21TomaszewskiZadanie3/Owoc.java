package Zestaw21TomaszewskiZadanie3;

public 
    class Owoc {
        
    private String nazwa;
    private double masa;
    public Owoc(){}
    
    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }
        
    public String getNazwa(){
        return this.nazwa;
    }
        
    public void setMasa(double masa){
        this.masa = masa;
    }
        
    public double getMasa(){
        return this.masa;
    }
    
    public String toString(){
        return "[ Owoc: " + this.nazwa + ", masa: " + this.masa + " ]";
    }
}

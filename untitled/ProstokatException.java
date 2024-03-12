public class ProstokatException extends Exception{
    public ProstokatException(){
        super("Bledny prostokat!\n");
    }
    public String toString(){
        return "Bledn prostokat!\n";
    }
}

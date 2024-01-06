package Zestaw17Zadanie1;

public class Node {
    int a;
    Node next;
    public Node(){}
    public Node(int a){
        this.a = a;
        this.next = null;
    }
    public Node(int a, Node next){
        this.a = a;
        this.next = next;
    }
}

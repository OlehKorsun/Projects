package Zestaw17Zadanie1;

public class SortedSLL {
    Node head;
    public SortedSLL(){
        this.head = null;
    }

    public void addSorted(int a){
        if(this.head == null || a <= head.a){
            head = new Node(a, head);
            return;
        }

        Node tmp = head;
        while(tmp.next!=null && tmp.next.a<a){
            tmp = tmp.next;
        }
        tmp.next = new Node(a, tmp.next);
    }

    public void show(){
        System.out.print("[ ");
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.a + " ");
            tmp = tmp.next;
        }
        System.out.print("]");
    }
}

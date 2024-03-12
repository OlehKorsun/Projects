package PJC;

import java.util.ArrayList;
import java.util.List;

public class PJC {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        System.out.println(ints.size());
        addElement(ints);
        System.out.println(ints.size());
    }

    public static void addElement(List<Integer> list) {
        list.add(10);
    }
}

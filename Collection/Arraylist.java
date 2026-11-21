package Collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        
    List<Integer> list = new ArrayList<>();
    list.add(23);
    list.add(21);
    list.add(21);
    list.add(222);
    list.add(212);
    list.add(211);

    list.add(null);
    list.add(null);
    list.set(2, 999);
    list.addFirst(121);
    System.out.println(list);
    }


}

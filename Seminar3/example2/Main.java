package Seminar3.example2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Эфир");
        list.add("Гидроген");
        list.add("Оксиген");
        list.add("Карбон");
        list.add("Феррум");
        MyIterator iterator = new MyIterator(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

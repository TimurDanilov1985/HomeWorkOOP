package Seminar3.example2;

import java.util.ArrayList;

public class MyIterator implements Iterator1 {
    private ArrayList<String> list;
    private int index = 0;
    public MyIterator() {

    }
    public MyIterator(ArrayList<String> list) {
        this.list = list;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }


    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public String next() {
        return list.get(index++);
    }
}
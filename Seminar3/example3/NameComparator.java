package Seminar3.example3;

import java.util.Comparator;

public class NameComparator implements Comparator<Truck> {

    @Override
    public int compare(Truck o1, Truck o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

package Seminar3.example3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Truck> truckList = new ArrayList<Truck>();
        truckList.add(new Truck("Tayga 6436", 50, 260));
        truckList.add(new Truck("Step 310E", 18, 300));
        truckList.add(new Truck("DAN 96320", 75,400));
        truckList.add(new Truck("Voron AE-380", 60,230));
        truckList.add(new Truck("ZIL-131", 16,350));

        System.out.println("До сортировки");

        for (Truck truck : truckList) {
            System.out.println("Truck: " + truck.getName() + " Capacity: " + truck.getCapacity() + " Motion: " + truck.getMotion());
        }

        Collections.sort(truckList, new NameComparator());

        System.out.println("После сортировки");

        for (Truck truck : truckList) {
            System.out.println("Truck: " + truck.getName() + " Capacity: " + truck.getCapacity() + " Motion: " + truck.getMotion());
        }
    }
}

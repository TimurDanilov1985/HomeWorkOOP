package Seminar6.openClosed;

public class Main {
    public static void main(String[] args) {
        Light car1 = new Light("130", "10 t", 5000, 500);
        Heavy car2 = new Heavy("Ural","25 t", 8000, "50 l");
        car1.load();
        car2.load();
    }
}
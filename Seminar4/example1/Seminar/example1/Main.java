package Seminar.example1;

public class Main {
    public static void main(String[] args) {
        Gen<Integer> gen = new Gen<>(50);
        gen.printElement();
        Gen<String> gen1 = new Gen<>("Интересный курс по ООП");
        gen1.printElement();
        Gen<Double> gen2 = new Gen<>(1.5);
        gen2.printElement();
    }
}
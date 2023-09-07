package Seminar3.example1;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface sum = (a, b) -> a + b;
        System.out.println(sum.calculate(25, 5));
    }
}

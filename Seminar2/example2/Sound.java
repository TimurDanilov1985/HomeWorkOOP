package Seminar2.example2;

public interface Sound {
    void greet();
    default void sound() {
        System.out.println("Мррррр");
    }
}

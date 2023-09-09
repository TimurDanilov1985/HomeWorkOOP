package Seminar.example1;

public class Gen<T>{
    private T value;

    public Gen(T value) {
        this.value = value;
    }


    public T getValue() {
        return value;
    }
    public void printElement() {
        System.out.println(getValue());
    }
}
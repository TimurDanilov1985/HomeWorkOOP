package Seminar4.example2;

public class GenArr<T> {
    private T[] array;

    public GenArr(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void printArray() {
        for (T elem : getArray()) {
            System.out.println(elem);
        }
    }
}

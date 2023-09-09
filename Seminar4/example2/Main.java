package Seminar4.example2;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 7, 10, 6, 4};
        GenArr<Integer> genArr = new GenArr<>(array);
        genArr.printArray();
        String[] array1 = {"Купрум", "Плюмбум", "Аргентум", "Аурум", "Феррум"};
        GenArr<String> genArr1 = new GenArr<>(array1);
        genArr1.printArray();
    }
}

package Seminar7.calculatorComplexNumbers;

import java.util.Scanner;

public class ViewCalculator {

    public void greet() {
        System.out.println(String.format("%s%n%s%n%n%s%n%s%n%n%s%n","Здравствуйте","Добро пожаловать в программу калькулятор комплексных чисел",
                                         "Числа вида a + bi или a - bi, где a, b - вещественные числа, i - мнимая единица,",
                                         "для которой выполняется равенство (i в степени 2 равно -1) i2 = -1",
                                         "Программа выполняет сложение, умножение и деление комплексных чисел"));
    }
    public String input(String objectValue) {
        Scanner inp = new Scanner(System.in);
        System.out.print(objectValue);
        return inp.nextLine();
    }

    public void message(String mess) {
        System.out.println(mess);
    }
}

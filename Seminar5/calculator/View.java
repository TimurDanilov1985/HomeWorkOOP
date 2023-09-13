package Seminar5.calculator;

import java.util.Scanner;

public class View {
    public void hello(String greet) {
        System.out.println(greet);
    }
    public String input (String numberValue) {
        Scanner scan = new Scanner(System.in);
        System.out.print(numberValue);
        return scan.nextLine();
    }

    public void printError(String error) {
        System.out.print(error);
    }
    public void printResult(String definition, Double result) {
        System.out.print(definition + result);
    }
}

package Seminar7.calculatorComplexNumbers;

import java.text.DecimalFormat;

public class ModelCalculator {
    public String add(double a1, double b1, double a2, double b2) {
        DecimalFormat format = new DecimalFormat();
        String result;
        double real, imaginary;
        real = a1 + a2;
        imaginary = b1 + b2;
        result = format.format(real) + " " + "+" + " " + format.format(imaginary) + "i";
        return result;
    }
    public String difference(double a1, double b1, double a2, double b2) {
        DecimalFormat format = new DecimalFormat();
        String result;
        double real, imaginary;
        real = a1 - a2;
        imaginary = b1 - b2;
        result = format.format(real) + " " + "+" + " " + format.format(imaginary) + "i";
        return result;
    }
    public String multiplication(double a1, double b1, double a2, double b2) {
        DecimalFormat format = new DecimalFormat();
        String result;
        double real, imaginary;
        real = a1 * a2 - b1 * b2;
        imaginary = a1 * b2 + a2 * b1;
        result = format.format(real) + " " + "+" + " " + format.format(imaginary) + "i";
        return result;
    }
    public String division(double a1, double b1, double a2, double b2) {
        if (a2 == 0 && b2 == 0) {
            return "Деление не возможно. Комплексное число в знаменателе равно нулю";
        }
        DecimalFormat format = new DecimalFormat();
        String result;
        double real, imaginary;
        real = ((a1 * a2) + (b1 * b2)) / ((a2 * a2) + (b2 * b2));
        imaginary = ((a2 * b1) - (a1 * b2)) / ((a2 * a2) + (b2 * b2));
        result = format.format(real) + " " + "+" + " " + format.format(imaginary) + "i";
        return result;
    }
}

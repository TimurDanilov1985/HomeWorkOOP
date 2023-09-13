package Seminar5.calculator;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void calculate() {
        view.hello("Здравствуйте. Добро пожаловать в программу калькулятор");
        double number1 = 0;
        double number2 = 0;
        double result = 0;
        String num1 = view.input("Введите первое число: ");
        String operator = view.input("Введите оператор: ");
        String num2 = view.input("Введите второе число: ");
        if (isNumeric(num1)) {
            number1 = Double.parseDouble(num1);
        } else {
            System.out.println("Введите числовое значение");
        }
        if (isNumeric(num1)) {
            number2 = Double.parseDouble(num2);
        } else {
            System.out.println("Введите числовое значение");
        }
        try {
            switch (operator) {
                case "+":
                    result = model.add(number1, number2);
                    break;
                case "-":
                    result = model.subtract(number1, number2);
                    break;
                case "*":
                    result = model.multiply(number1, number2);
                    break;
                case "/":
                    result = model.divide(number1, number2);
                    break;
                default:
                    view.printError("Неверная операция");
                    return;
            }
            view.printResult("Результат: ", result);
        } catch (ArithmeticException e) {
            view.printError(e.getMessage());
        }
    }
}

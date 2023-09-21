package Seminar7.calculatorComplexNumbers;

public class Main {
    public static void main(String[] args) {
        ViewCalculator view = new ViewCalculator();
        ModelCalculator model = new ModelCalculator();
        Logging logging = new Logging();
        Validation validation = new Validation();
        Conversion conversion = new Conversion();
        Menu menu = new Menu();
        CalculatorController controller = new CalculatorController(model, view, logging, validation, conversion, menu);
        controller.calculation();
    }
}


package Seminar7.calculatorComplexNumbers;

public class Validation {
    public boolean checkNumber(String value) {
        if (value != null) {
            try {
                Double.parseDouble(value);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }
    public boolean checkOperator(String operator) {
        if (operator != null) {
            if (operator.equals("+") || operator.equals("*") || operator.equals("/") || operator.equals("-")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

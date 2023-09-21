package Seminar7.calculatorComplexNumbers;

public class CalculatorController {
    private ModelCalculator modelCalculator;
    private ViewCalculator viewCalculator;
    private Logging logging;
    private Validation validation;
    private Conversion conversion;
    private Menu menu;

    public CalculatorController(ModelCalculator modelCalculator, ViewCalculator viewCalculator, Logging logging, Validation validation,
                                Conversion conversion, Menu menu) {
        this.modelCalculator = modelCalculator;
        this.viewCalculator = viewCalculator;
        this.logging = logging;
        this.validation = validation;
        this.conversion = conversion;
        this.menu = menu;
    }

    public void calculation() {
        logging.log("запуск приложения");
        String sa1, sb1, sa2, sb2, operator, result;
        double a1, b1, a2, b2;
        String errorNum = "Введенные данные не корректны! Введите пожалуйста числовое значение";
        String errorSignOperator = "Введенные данные не корректны! Введите пожалуйста знак оператор плюс + или минус - " +
                "или знак умножение * , или знак деление /";
        String message = "Для ввода корректных данных введите 1\n" +
                "Для выхода из программы нажмите любую клавишу";
        viewCalculator.greet();
        for (; ; ) {
            sa1 = viewCalculator.input("Введите действительную часть первого комплексного числа (a1): ");
            if (validation.checkNumber(sa1)) {
                a1 = conversion.parsing(sa1);
                viewCalculator.message(String.format("Первое число: %s + b1i", sa1));
                break;
            } else {
                logging.log("ошибка пользователя при вводе действительной части первого комплексного числа");
                viewCalculator.message(errorNum);
                menu.select(viewCalculator.input(message));
            }
        }
        logging.log("введена действительная часть первого комплексного числа (a1): " + sa1);
        for (; ; ) {
            sb1 = viewCalculator.input("Введите коэффициент мнимой части первого комплексного числа (b1): ");
            if (validation.checkNumber(sb1)) {
                b1 = conversion.parsing(sb1);
                viewCalculator.message(String.format("Первое число: %s + %si", sa1, sb1));
                break;
            } else {
                logging.log("ошибка пользователя при вводе коэффициента мнимой части первого комплексного числа");
                viewCalculator.message(errorNum);
                menu.select(viewCalculator.input(message));
            }
        }
        logging.log("введен коэффициент мнимой части первого комплексного числа (b1): " + sb1);
        for (; ; ) {
            sa2 = viewCalculator.input("Введите действительную часть второго комплексного числа (a2): ");
            if (validation.checkNumber(sa2)) {
                a2 = conversion.parsing(sa2);
                viewCalculator.message(String.format("Второе число: %s + b2i", sa2));
                break;
            } else {
                logging.log("ошибка пользователя при вводе действительной части второго комплексного числа");
                viewCalculator.message(errorNum);
                menu.select(viewCalculator.input(message));
            }
        }
        logging.log("введена действительная часть второго комплексного числа (a2): " + sa2);
        for (; ; ) {
            sb2 = viewCalculator.input("Введите коэффициент мнимой части второго комплексного числа (b2): ");
            if (validation.checkNumber(sb2)) {
                b2 = conversion.parsing(sb2);
                viewCalculator.message(String.format("Второе число: %s + %si", sa2, sb2));
                break;
            } else {
                logging.log("ошибка пользователя при вводе коэффициента мнимой части второго комплексного числа");
                viewCalculator.message(errorNum);
                menu.select(viewCalculator.input(message));
            }
        }
        logging.log("введен коэффициент мнимой части второго комплексного числа (b2): " + sb2);
        for (; ; ) {
            operator = viewCalculator.input("Введите оператор для выполнения математического действия " +
                    "с комплексными числами +; -; *; /: ");
            if (validation.checkOperator(operator)) {
                break;
            } else {
                logging.log("ошибка пользователя при вводе оператора для выполнения математического действия с комлексными числами");
                viewCalculator.message(errorSignOperator);
                menu.select(viewCalculator.input(message));
            }
        }
        logging.log("введен оператор для выполнения математического действия с комлексными числами: " + operator);
        viewCalculator.message("Сформированы следующие комплексные числа:");
        viewCalculator.message(String.format("Первое комплексное число: %s + %si", sa1, sb1));
        viewCalculator.message(String.format("Второе копмлексное число: %s + %si", sa2, sb2));
        logging.log("сформированы следующие комплексные числа:");
        logging.log(String.format("первое комплексное число: %s + %si", sa1, sb1));
        logging.log(String.format("второе копмлексное число: %s + %si", sa2, sb2));
        switch (operator) {
            case ("+"):
                result = String.format("Результат сложения комплексных чисел: (%s + %si) + (%s + %si) = %s",
                        sa1, sb1, sa2, sb2, modelCalculator.add(a1, b1, a2, b2));
                viewCalculator.message(result);
                logging.log(result + "\n");
                break;
            case ("-"):
                result = String.format("Результат вычитания комплексных чисел: (%s + %si) - (%s + %si) = %s",
                        sa1, sb1, sa2, sb2, modelCalculator.difference(a1, b1, a2, b2));
                viewCalculator.message(result);
                logging.log(result + "\n");
                break;
            case ("*"):
                result = String.format("Результат произведения комплексных чисел: (%s + %si) * (%s + %si) = %s",
                        sa1, sb1, sa2, sb2, modelCalculator.multiplication(a1, b1, a2, b2));
                viewCalculator.message(result);
                logging.log(result + "\n");
                break;
            case ("/"):
                result = String.format("Результат деления комплексных чисел: (%s + %si) / (%s + %si) = %s",
                        sa1, sb1, sa2, sb2, modelCalculator.division(a1, b1, a2, b2));
                viewCalculator.message(result);
                logging.log(result + "\n");
                break;
            default:
                break;
        }
        //viewCalculator.message("Вывод логирования на экран");
        //logging.readLogFile();
    }
}

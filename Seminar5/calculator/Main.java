package Seminar5.calculator;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Presenter presenter = new Presenter(view, model);
        presenter.calculate();
    }
}

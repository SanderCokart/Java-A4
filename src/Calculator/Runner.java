package Calculator;

import Calculator.controller.Controller;
import Calculator.model.Model;
import Calculator.view.View;

public class Runner {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
    }
}

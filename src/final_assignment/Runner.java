package final_assignment;

import final_assignment.controller.Controller;
import final_assignment.model.Model;
import final_assignment.view.View;

public class Runner {
    public static void main(String[] args) {
        View view = new View();//create view
        Model model = new Model();//create model
        Controller controller = new Controller(model, view);//create controller and pass on the Model and the View
    }
}

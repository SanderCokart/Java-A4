package eindopdrachtv2;

import eindopdrachtv2.controller.Controller;
import eindopdrachtv2.model.Model;
import eindopdrachtv2.view.View;

public class Runner {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(view, model);
    }
}

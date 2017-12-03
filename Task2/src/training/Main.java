package training;

/**
 * Main class
 * Created by Viacheslav Skryl on 02.11.2017
 */

public class Main {

    public static void main(String[] args) {

        //Initialization of objects
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);

        //Run of controller
        controller.Run();
    }
}

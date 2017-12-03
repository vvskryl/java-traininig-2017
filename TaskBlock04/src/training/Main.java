package training;

/**
 * Created by Viacheslav Skryl on 10.11.2017
 */

public class Main {

    public static void main(String[] args) {

        //Initialization of objects
        Controller controller = new Controller(new Model(), new View());

        //Run of controller
        controller.Run();
    }
}
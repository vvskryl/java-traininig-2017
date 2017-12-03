package training.task01;

import training.task01.biz.controller.Controller;
import training.task01.biz.controller.ControllerBuilder;

/**
 * @author
 * Created by Viacheslav Skryl on 01.12.2017
 */

public class Main {

	public static void main(String[] args) {
        Controller controller = ControllerBuilder.getController();

        controller.Run();
	}
}

package training.task01.biz.controller;

import training.task01.biz.model.Model;
import training.task01.biz.view.View;

/**
 * @author
 * Created by Viacheslav Skryl on 02.12.2017
 */

public class ControllerBuilder {
	
	public static Controller getController() {
		return Controller.getController(Model.getModel(), View.getView());
	}
}

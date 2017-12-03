package training.task01.biz.controller;

import training.task01.biz.model.Model;
import training.task01.biz.view.View;
import training.task01.biz.view.ViewConstants;
import training.task01.util.IntPositiveRequester;
import training.task01.util.Toys.ToysCategory;

/**
 * @author
 * Created by Viacheslav Skryl on 02.12.2017
 */

public class Controller {
	Model model;
	View view;
	
	private Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	static Controller getController(Model model, View view) {
		return new Controller(model, view);
	}
	
	public void Run() {
		View.printStartMessage();
		model.setSumMoney(IntPositiveRequester.getRequester(ViewConstants.ASK_FOR_SUM_MONEY, 
				 											ViewConstants.ILLEGAL_INPUT)
								 			  .getIntPositive());
		
		View.printToConsole("\n" + ViewConstants.CHOSE_TOYS);
		model.autoMakeToysList();
		View.printToConsole(ViewConstants.UNUSED_MONEY + model.getSumMoney());
		
		model.sortToysList(model.getToysList(),
						   IntPositiveRequester.getRequester(ViewConstants.ASK_FOR_SORT_PARAMETER, 
															 ViewConstants.ILLEGAL_INPUT)
											   .getIntPositive());
		
		view.printToysList(model.getToysList());
		
//		View.printToConsole("\n" + ViewConstants.USE_TOYS);
//		model.useAllToys();
		
		View.printToConsole("\n" + ViewConstants.FILTRED_TOYS);
		view.printToysList(model.getFiltredToyList(model.getToysList(), 0, 8, 
												   ToysCategory.GAME));
	}
}
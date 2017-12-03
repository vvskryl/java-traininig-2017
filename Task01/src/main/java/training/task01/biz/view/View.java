package training.task01.biz.view;

import java.util.ArrayList;

import training.task01.util.Toys.Toy;

/**
 * @author
 * Created by Viacheslav Skryl on 02.12.2017
 */

public class View {

    public static View getView() {
		return new View();
	}
	
	public static void printToConsole(Object toPrint) {
    	System.out.println(toPrint);
    }

	public static void printStartMessage() {
		View.printToConsole(ViewConstants.WELCOME);
		View.printToConsole(ViewConstants.DESCRIPTION_OF_APP);
	}
	public void printToysList(ArrayList<Toy> toys) {
		for (Toy toy : toys)
			View.printToConsole(toy);
	}
}

package training;

import java.util.Scanner;

public class Controller {
	//Conctructor
	Model model;
	View view;
	
	public Controller (Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	//Run Controller
	public void Run() {
		//First input
		View.print(View.WELCOME);
		this.askForInput();
		int guessNum = this.inputInt();
		
		//Loop for guess number
		while(!model.getFinish(guessNum)) {
			View.print(View.ATTEMPTS + model.getAttempts());
			View.print(View.WRONG);
			this.askForInput();
			guessNum = this.inputInt();
		}
		
		//Finish of game
		View.print(View.CONGRATULATION + guessNum + " with " + model.getCountAttempts() + " (" + model.getAttempts() + ") attempts.");
	}
	
	public void askForInput() {
		View.print(View.ASK_FOR_INPUT + "[" + model.getLowerBound() + "," + model.getUpperBound() + "]: ");
	}
	
	//Input integer with Scanner
	public int inputInt() {
		Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()) {
        	View.print(View.ASK_FOR_INT);
            sc.next();
        }
        return sc.nextInt();
	}
	
}

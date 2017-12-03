package training;

import java.util.Scanner;

/**
 * Created by Viacheslav Skryl on 10.11.2017
 */

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
		view.welcome();
		Scanner sc = new Scanner(System.in);
		int i = 3;
		while (i > 0) {
			try {
				model.addInput(view, sc);
			} catch (EqualNickNameException e) {
				View.print(e.message);
			} catch (EqualEmailException e) {
				View.print(e.message);
			}
			i--;
		}	
	}

}

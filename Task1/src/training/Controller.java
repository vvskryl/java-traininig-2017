package training;

import java.util.Scanner;

/**
 * Class for manage program
 * Created by Viacheslav Skryl on 01.11.2017
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
	public void Run(){
        //Ask user for input
		while(model.getEndOfInput()) {
			view.print(View.ASK_FOR_WORD + "\"" + model.getExpectWord() + "\"\n");
			Scanner sc = new Scanner(System.in);
	        
	        if(!model.addWord(sc.toString())) {
	        	view.print(View.INCORRECT_INPUT);
	        }

		}
		
		//Print of result
		view.print(View.FULL_INPUT + model.makeSentenence());
		
    }

}

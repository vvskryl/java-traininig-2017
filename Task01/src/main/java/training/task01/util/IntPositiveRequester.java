package training.task01.util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author
 * Created by Viacheslav Skryl on 02.12.2017
 */

public class IntPositiveRequester {
	private String askForInput;
	private String illegalInput;
	
	private IntPositiveRequester(String askForInput, String illegalInput) {
		this.askForInput = askForInput;
		this.illegalInput = illegalInput + " ";
	}
	public static IntPositiveRequester getRequester(String askForInput, String illegalInput) {
		return new IntPositiveRequester(askForInput, illegalInput);
	}
	
	public int getIntPositive() {
		int res;
		
		System.out.print(askForInput);
		
		Scanner sc = new Scanner(System.in);
		try {
			res = sc.nextInt();
		} catch (InputMismatchException e) {
			res = repeatRequest();
		}
		
		if (res < 0) 
			res = repeatRequest();
		
		return res;
	}
	
	private int repeatRequest() {
		System.out.print(illegalInput);
		return getIntPositive();
	}
}

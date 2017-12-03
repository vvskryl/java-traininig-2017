package training;

/**
 * Calculator for learning Junit
 * Created by Viacheslav Skryl on 05.11.2017
 */

public class TaskJunit {	
	public double add(double a, double b) {
		return a + b;
	}
	
	public double deduct(double a, double b) {
		return a - b;
	}
	
	public double mult(double a, double b) {
		return a * b;
	}
	
	public double div(double a, double b) {
		if (b == 0) throw new ArithmeticException();
		return a / b;
	}

}

package training;

/**
 * Class for business logic
 * Created by Viacheslav Skryl on 02.11.2017
 */

public class Model {
	//Data
	private int lowerBound = 0;
	private int upperBound = 100;
	private int countAttempts = 0;
	private int rand = (int)(Math.random()*(upperBound - lowerBound) + lowerBound);
	private String attempts = " ";
	
	//Return the bounds of random number
	public int getLowerBound() {
		return lowerBound;
	}
	public int getUpperBound() {
		return upperBound;
	}
	
	//Check the end of game
	public boolean getFinish(int guessNum) {
		attempts += ("" + guessNum + " ");
		countAttempts++;
		if (guessNum == rand)
			return true;
		if (guessNum > rand & guessNum < upperBound)
			upperBound = guessNum;
		if (guessNum < rand & guessNum > lowerBound)
			lowerBound = guessNum;
		return false;
	}
	
	//Get attempts of user
	public String getAttempts() {
		return attempts;
	}
	
	//Get number of users attempts
	public int getCountAttempts() {
		return countAttempts;
	}

}

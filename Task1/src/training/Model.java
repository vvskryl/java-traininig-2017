package training;

/**
 * Class for business logic
 * Created by Viacheslav Skryl on 01.11.2017
 */

public class Model {
	//Data
	private String [] words = {"Hello", "world!"};
	private int endOfInput = words.length;
	private String sentenence;
	
	//Check for end of users input
	public boolean getEndOfInput() {
		if (endOfInput == 0)
			return true;
		return false;
	}
	
	//Return word what is expexting from user
	public String getExpectWord() {
		return words[words.length - endOfInput];
	}
	
	//Adding word to sentenence
	public boolean addWord(String word) {
		if (word.matches(words[words.length - endOfInput])) {
			sentenence += word;
			endOfInput--;
			return true;
		}
		return false;
	}
	
	//Return the result setenence
	public String makeSentenence() {
		return sentenence;
	}

}

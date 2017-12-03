package training.task01.util.Toys;

/**
 * @author
 * Created by Viacheslav Skryl on 03.12.2017
 */

public class ToyForBig extends Toy {
	
	protected ToyForBig(String name, String use) {
		super(name, use, ToysCategory.FOR_BIG);
	}
	
	public static ToyForBig getToy(String name, String use) {
		return new ToyForBig(name, use);
	}

	public void learn() {
		System.out.println(ToyActions.LEARN + this);
	}
	public void exercise() {
		System.out.println(ToyActions.EXERCISE + this);
	}
	public void tryAllActions() {
		play();
		learn();
		exercise();
	}
}

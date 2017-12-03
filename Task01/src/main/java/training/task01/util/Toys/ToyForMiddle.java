package training.task01.util.Toys;

/**
 * @author
 * Created by Viacheslav Skryl on 03.12.2017
 */

public class ToyForMiddle extends Toy {
	
	protected ToyForMiddle(String name, String use) {
		super(name, use, ToysCategory.FOR_MIDDLE);
	}
	
	public static ToyForMiddle getToy(String name, String use) {
		return new ToyForMiddle(name, use);
	}

	public void learn() {
		System.out.println(ToyActions.LEARN + this);
	}
	public void tryAllActions() {
		play();
		learn();
	}
}

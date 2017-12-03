package training.task01.util.Toys;

/**
 * @author
 * Created by Viacheslav Skryl on 03.12.2017
 */

public class ToyForLittle extends Toy {
	
	protected ToyForLittle(String name, String use) {
		super(name, use, ToysCategory.FOR_LITTLE);
	}
	
	public static ToyForLittle getToy(String name, String use) {
		return new ToyForLittle(name, use);
	}

	public void taste() {
		System.out.println(ToyActions.TASTE + this);
	}
	public void tryAllActions() {
		play();
		taste();
	}
}

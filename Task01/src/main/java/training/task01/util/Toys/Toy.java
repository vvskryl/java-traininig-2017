package training.task01.util.Toys;

/**
 * @author
 * Created by Viacheslav Skryl on 01.12.2017
 */

abstract public class Toy {
	//Parameters for sorting ToysList
	final static public int NAME = 0;
	final static public int USE = 1;
	final static public int AGE_CATEGORY = 2;
	
	private String UNSUPPORTED_COMPARE_PARAMETR = "Помилковий параметр для порівняння - ";
	
	private String name;
	private String use;
	private int ageCategory;
	
	public String getName() {
		return name;
	}
	public String getUse() {
		return use;
	}
	public int getAgeCategory() {
		return ageCategory;
	}

	protected Toy(String name, String use, int ageCategory) {
		this.name = name;
		this.use = use;
		this.ageCategory = ageCategory;
	}
	
	public void play() {
		System.out.println(ToyActions.PLAY + this);
	}
	abstract public void tryAllActions();
	
	//Compare this with toy by parameter. If this less than toy res less than 0,
	//if this equal toy res is 0, and if this bigger than toy, res bigger than 0
	public int compareByParametr(Toy toy, int parametr) {
		int res = 0;
		switch (parametr) {
			case NAME:
				res = this.name.compareToIgnoreCase(toy.getName());
				break;
			case USE:
				res = this.use.compareToIgnoreCase(toy.getUse());
				break;
			case AGE_CATEGORY:
				res = this.ageCategory - toy.getAgeCategory();
				break;
			default: System.out.println(UNSUPPORTED_COMPARE_PARAMETR + parametr);
		}
		return res;
	}
	
	public String toString() {
		return "\"" + name + "\" (категорія \"" + use + "\" від " + ageCategory + " років).";
	}
}
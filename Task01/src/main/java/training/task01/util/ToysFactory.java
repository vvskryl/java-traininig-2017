package training.task01.util;

import training.task01.util.Toys.*;

/**
 * @author
 * Created by Viacheslav Skryl on 02.12.2017
 */

public class ToysFactory {
	private String AGE_CATEGORY = "Вікова категорія";
	private String UNSUPPORTED = "не підтримується.";
	private String use;
	
	private ToysFactory(String use) {
		this.use = use;
	}
	public static ToysFactory getFactory(String use) {
		return new ToysFactory(use);
	}
	
	public Toy getToy(int ageCategory, String name) {
		Toy toy = null;
		switch(ageCategory) {
			case ToysCategory.FOR_LITTLE:
				toy = ToyForLittle.getToy(name, use);
				break;
			case ToysCategory.FOR_MIDDLE:
				toy = ToyForMiddle.getToy(name, use);
				break;
			case ToysCategory.FOR_BIG:
				toy = ToyForBig.getToy(name, use);
				break;
			default: usupportAgeCategory(ageCategory);
		}
		return toy;
	}
	private void usupportAgeCategory(int ageCategory) {
		System.out.println(AGE_CATEGORY + " \"" + ageCategory + "\" " + UNSUPPORTED);
	}
}

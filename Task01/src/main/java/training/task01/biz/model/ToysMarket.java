package training.task01.biz.model;

import training.task01.util.Toys.ToysCategory;

/**
 * @author
 * Created by Viacheslav Skryl on 02.12.2017
 */

public enum ToysMarket {
	//Toy			 name				use							ageCategory				 price
	BALL			("М'яч", 			ToysCategory.GAME,			ToysCategory.FOR_BIG, 	 50),
	CAR				("Машина", 			ToysCategory.GAME,			ToysCategory.FOR_MIDDLE, 30),
	SOFT_BEAR		("М'який ведмідь",	ToysCategory.GAME,			ToysCategory.FOR_LITTLE, 70),
	LEGO			("Лего", 			ToysCategory.DEVELOPMENT,	ToysCategory.FOR_MIDDLE, 100),
	ALPHABET		("Абетка",	 		ToysCategory.DEVELOPMENT,	ToysCategory.FOR_MIDDLE, 20),
	MAP				("Мапа", 			ToysCategory.DEVELOPMENT,	ToysCategory.FOR_BIG,	 60),
	FIFTEEN			("П'ятнашки", 		ToysCategory.DEVELOPMENT, 	ToysCategory.FOR_MIDDLE, 25),
	DOLL			("Кукла", 			ToysCategory.GAME, 			ToysCategory.FOR_MIDDLE, 83),
	PUZZLE			("Пазл", 			ToysCategory.GAME, 			ToysCategory.FOR_BIG,	 76),
	CUBES			("Кубики", 			ToysCategory.DEVELOPMENT, 	ToysCategory.FOR_LITTLE, 112),
	TRAMPOLINE		("Батут", 			ToysCategory.GAME,			ToysCategory.FOR_BIG,	 1600),
	COLORING_BOOK	("Розмальовка", 	ToysCategory.DEVELOPMENT, 	ToysCategory.FOR_LITTLE, 24),
	RUBICS_CUBE		("Кубик Рубіка",	ToysCategory.DEVELOPMENT, 	ToysCategory.FOR_BIG,	 57),
	PYRAMID			("Пірамидка", 		ToysCategory.DEVELOPMENT, 	ToysCategory.FOR_LITTLE, 89);
	
	private String name;
	private String use;
	private int ageCategory;
	private int price;
	
	ToysMarket(String name, String use, int ageCategory, int price) {
		this.name = name;
		this.use = use;
		this.ageCategory = ageCategory;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getUse() {
		return use;
	}
	public int getAgeCategory() {
		return ageCategory;
	}
	public int getPrice() {
		return price;
	}
}

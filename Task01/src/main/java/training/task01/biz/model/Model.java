package training.task01.biz.model;

import java.util.ArrayList;
import java.util.Random;

import training.task01.biz.view.View;
import training.task01.util.Toys.*;
import training.task01.util.ToysFactory;

/**
 * @author
 * Created by Viacheslav Skryl on 02.12.2017
 */

public class Model {
	private int sumMoney;
	private ArrayList<Toy> toys = new ArrayList<Toy>();
	
	public static Model getModel() {
		return new Model();
	}
	
	public void setToysList(ArrayList<Toy> toys) {
		this.toys = toys;
	}
	public ArrayList<Toy> getToysList() {
		return toys;
	}
	public void setSumMoney(int sumMoney) {
		this.sumMoney = sumMoney;
	}
	public int getSumMoney() {
		return sumMoney;
	}
	
	/**
	 * Create ArrayList of Random Toys from ToysMarket
	 * @return toys
	 */
	public ArrayList<Toy> autoMakeToysList() {
		ToysMarket toysList[] = ToysMarket.values();
		int numberOfToys = toysList.length;
		
		int minPrice = toysList[0].getPrice();
		for (int i = 1; i < numberOfToys; i++)
			minPrice = (minPrice > toysList[i].getPrice()) ? toysList[i].getPrice() : minPrice;
		
		Random rnd = new Random();
		while (sumMoney >= minPrice) {
			int i = rnd.nextInt(numberOfToys);
			
			while (sumMoney < toysList[i].getPrice())
				i = ++i % toysList.length;
			
			toys.add(ToysFactory.getFactory(toysList[i].getUse())
								.getToy(toysList[i].getAgeCategory(),
										toysList[i].getName()));
			
			sumMoney -= toysList[i].getPrice();
			
			View.printToConsole(toysList[i].getName() + " за " + toysList[i].getPrice() + " грн.");
		}
		
		return toys;
	}

	/**
	 * Sort ArrayList toys with sorts parameter "parameter"
	 * @param toys, parameter
	 * @return toys
	 */
	public ArrayList<Toy> sortToysList(ArrayList<Toy> toys, int parameter) {
		for (int i = 0; i < toys.size(); i++)
			for (int j = i; j < toys.size(); j++)
				if (toys.get(i).compareByParametr(toys.get(j), parameter) > 0)
					toys.set(j, toys.set(i, toys.get(j)));
		return toys;
	}

	/**
	 * Use all generals methods of toys
	 */
	public void useAllToys() {
		for (Toy toy : toys)
			toy.tryAllActions();
	}

	/**
	 * Filter ArrayList toys in range min-max Age in category "use"
	 * @param toys, minAge, maxAge, use
	 * @return filtredToys
	 */
	public ArrayList<Toy> getFiltredToyList(ArrayList<Toy> toys, int minAge, int maxAge, 
											String use) {
		ArrayList<Toy> filtredToys = new ArrayList<Toy>();
		
		for (Toy toy : toys) {
			if (toy.getAgeCategory() >= minAge && toy.getAgeCategory() <= maxAge
											   && toy.getUse().equals(use))
				filtredToys.add(toy);
		}
		
		return filtredToys;
	}	
}

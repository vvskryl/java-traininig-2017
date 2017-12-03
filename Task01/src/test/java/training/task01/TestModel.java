package training.task01;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import training.task01.biz.model.Model;
import training.task01.biz.model.ToysMarket;
import training.task01.util.Toys.Toy;
import training.task01.util.Toys.ToyForBig;
import training.task01.util.Toys.ToyForLittle;
import training.task01.util.Toys.ToyForMiddle;
import training.task01.util.Toys.ToysCategory;

/**
 * Testclass for learn Junit
 * Created by Viacheslav Skryl on 05.11.2017
 */

public class TestModel {
	private static Model model;
	private static ArrayList<Toy> toys = new ArrayList<Toy>();
	
	@BeforeClass
	public static void runTest() {
		model = Model.getModel();
		model.autoMakeToysList();
		toys.add(ToyForBig.getToy(ToysMarket.BALL.getName(), ToysCategory.GAME));
		toys.add(ToyForMiddle.getToy(ToysMarket.LEGO.getName(), ToysCategory.DEVELOPMENT));
		toys.add(ToyForLittle.getToy(ToysMarket.CUBES.getName(), ToysCategory.DEVELOPMENT));
	}
	
	@Test
	public void testSortToysListByAge() {
		ArrayList<Toy> sortToys = new ArrayList<Toy>();
		sortToys = model.sortToysList(toys, 2);
		Assert.assertTrue(sortToys.get(0).getAgeCategory() == ToysCategory.FOR_LITTLE &&
						  sortToys.get(1).getAgeCategory() == ToysCategory.FOR_MIDDLE &&
						  sortToys.get(2).getAgeCategory() == ToysCategory.FOR_BIG);
	}
	
	@Test
	public void testSortToysListByUse() {
		ArrayList<Toy> sortToys = new ArrayList<Toy>();
		sortToys = model.sortToysList(toys, 1);
		Assert.assertTrue(sortToys.get(0).getUse().equals(ToysCategory.GAME) &&
						  sortToys.get(1).getUse().equals(ToysCategory.DEVELOPMENT) &&
						  sortToys.get(2).getUse().equals(ToysCategory.DEVELOPMENT));
	}
	
	@Test
	public void testSortToysListByName() {
		ArrayList<Toy> sortToys = new ArrayList<Toy>();
		sortToys = model.sortToysList(toys, 0);
		Assert.assertTrue(sortToys.get(0).getName().equals(ToysMarket.CUBES.getName()) &&
						  sortToys.get(1).getName().equals(ToysMarket.LEGO.getName()) &&
						  sortToys.get(2).getName().equals(ToysMarket.BALL.getName()));
	}
	
	@Test
	public void testGetFiltredToyList() {
		ArrayList<Toy> filtredToys = new ArrayList<Toy>();
		filtredToys = model.getFiltredToyList(toys, 4, 8, ToysCategory.DEVELOPMENT);
		Assert.assertTrue(filtredToys.get(0).getName().equals(ToysMarket.LEGO.getName()));
	}
}

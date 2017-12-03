package training;

import java.util.Arrays;

/**
 * @author
 * Created by Viacheslav Skryl on 26.11.2017
 */

public class Strategy {
	public static void main(String[] args) {
		StrategyClient c = new StrategyClient();
		int array[] = {1,5,3,4,2};
		
		c.setStrategy(new BubbleSort());
		c.executeStrategy(array);
	}
}

//Context
class StrategyClient {
	ISorting strategy;
	
	public void setStrategy(ISorting strategy) {
		this.strategy = strategy;
	}
	public void executeStrategy(int array[]) {
		strategy.sort(array);
	}
}
//Strategy
interface ISorting {
	void sort(int array[]);
}
class BubbleSort implements ISorting {
	public void sort(int[] array) {
		System.out.println("BubbleSort");
		System.out.println("Before " + Arrays.toString(array));
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		System.out.println("After " + Arrays.toString(array));
	}
}
package training;

import java.util.ArrayList;

/**
 * @author
 * Created by Viacheslav Skryl on 18.11.2017
 */

public class TaskBlock08 {

	public static void main(String[] args) {
		
		Integer [] input = {4, 5, 6, 4, 5, 3, 4, 2, 4, 5, 7};
		
		ArrayListUnclearable<Integer> a = new ArrayListUnclearable<Integer>(input);
		
		ArrayList<Integer> counter = new ArrayList<Integer>();
		for (Integer o: a) {
			countInteger(counter, o);
		}
		
		for (int i = 0; i < counter.size(); i++) {
			if (counter.get(i) != null) {
				System.out.println("The number " + i + " is " + counter.get(i).intValue());
			}
		}
	}

	private static void countInteger(ArrayList<Integer> counter, Integer number) {
		int num = number.intValue();
		
		if (counter.size() <= num) { ArrayListEnsureNull(counter, num + 1); }
		
		Integer i = counter.get(num);
		if (i == null) { counter.set(num, (Integer)1); }
		else { counter.set(num, (Integer)(i.intValue() + 1)); }
	}
	
	//Set size of arrayList with null-pointer
	private static void ArrayListEnsureNull(ArrayList<?> arrayList, int Size) {
		int ds = Size - arrayList.size();
		for (int i = 0; i < ds; i++) { arrayList.add(null); }
	}
}
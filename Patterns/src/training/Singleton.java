package training;

/**
 * @author
 * Created by Viacheslav Skryl on 25.11.2017
 */

public class Singleton {
	public static void main(String[] args) {

		final int SIZE = 1000;
		
		Thread t[] = new Thread[SIZE];
		for (int i = 0; i < SIZE; i++) {
			t[i] = new Thread(new Run());
			t[i].start();
		}
		for (int i = 0; i < SIZE; i++) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(SingletonBase.counter);
	}
}

class Run implements Runnable {
	@Override
	public void run() {
		SingletonBase.getInstance();
	}	
}

class SingletonBase {
	public static int counter = 0;
	private static volatile SingletonBase instance;
	private SingletonBase() {
		counter++;
	}
	
	public static SingletonBase getInstance() {
		if (instance == null) {
			synchronized(SingletonBase.class) {
				if (instance == null) {
					instance = new SingletonBase();
				}
			}
		}
		return instance;
	}
}
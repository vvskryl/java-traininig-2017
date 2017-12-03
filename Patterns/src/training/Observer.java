package training;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author
 * Created by Viacheslav Skryl on 25.11.2017
 */

public class Observer {

	public static void main(String[] args) {
		MeteoStation station = new MeteoStation();
		
		station.addObserver(new ConlsoleObserver());
		station.addObserver(new FileObserver());
		
		station.setMeasurments(25, 101);
		station.setMeasurments(24, 101);
	}
}

interface IObserverable {
	void addObserver(IObserver o);
	void removeObserver(IObserver o);
	void notifyObservers();
}

interface IObserver {
	void handleEvent(int temperature, int pressure);
}

class MeteoStation implements IObserverable {
	int temperature;
	int pressure;
	
	ArrayList<IObserver> observers = new ArrayList<>();
	
	void setMeasurments(int t, int p) {
		this.temperature = t;
		this.pressure = p;
		notifyObservers();
	}
	
	@Override
	public void addObserver(IObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (IObserver o: observers) {
			o.handleEvent(temperature, pressure);
		}
	}
}

class ConlsoleObserver implements IObserver {
	@Override
	public void handleEvent(int temperature, int pressure) {
		System.out.format("Temperature %d C, pressure %d kPa", temperature, pressure);
		System.out.println();
	}
}

class FileObserver implements IObserver {
	@Override
	public void handleEvent(int temperature, int pressure) {
		File f;
		try {
			f = File.createTempFile("TempAndPress", ".txt");
			PrintWriter pw = new PrintWriter(f);
			pw.println("T = " + temperature + ", P = " + pressure);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
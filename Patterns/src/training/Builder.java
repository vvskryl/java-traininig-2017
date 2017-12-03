package training;

/**
 * @author
 * Created by Viacheslav Skryl on 26.11.2017
 */

public class Builder {
	public static void main(String[] args) {
//		Car car = new CarBuilder()
//					.buildMake("Renault")
//					.buildTransmission(Transmission.AUTO)
//					.buildMaxSpeed(200)
//					.build();
//		System.out.println(car);
	
		Director director = new Director();
		director.setBuilder(new SubaruBuilder());
		Car car = director.buildCar();
		System.out.println(car);
	}
}

enum Transmission {
	MANUAL, AUTO
}
class Car {
	String make;
	Transmission transmission;
	int maxSpeed;
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String toString () {
		return "Car [make=" + make + ", transmission=" + transmission + 
				", maxSpeed=" + maxSpeed + "]";
	}
}

abstract class CarBuilder {
	Car car;
	
	void createCar() {
		car = new Car();
	}
	
	abstract void buildMake();
	abstract void buildTransmission();
	abstract void buildMaxSpeed();
	
	Car getCar() {
		return car;
	}
}
class FordBuilder extends CarBuilder {
	void buildMake() {
		car.setMake("Ford");
	}
	void buildTransmission() {
		car.setTransmission(Transmission.MANUAL);
	}
	void buildMaxSpeed() {
		car.setMaxSpeed(200);
	}	
}
class SubaruBuilder extends CarBuilder {
	void buildMake() {
		car.setMake("Subaru");
	}
	void buildTransmission() {
		car.setTransmission(Transmission.AUTO);
	}
	void buildMaxSpeed() {
		car.setMaxSpeed(300);
	}	
}

class Director {
	CarBuilder builder;

	public void setBuilder(CarBuilder builder) {
		this.builder = builder;
	}
	
	Car buildCar() {
		builder.createCar();
		builder.buildMake();
		builder.buildTransmission();
		builder.buildMaxSpeed();
		Car car = builder.getCar();
		return car;
	}
}

//class CarBuilder {
//	String make = "Default";
//	Transmission transmission = Transmission.MANUAL;
//	int maxSpeed = 120;
//	
//	CarBuilder buildMake(String make) {
//		this.make = make;
//		return this;
//	}
//	CarBuilder buildTransmission(Transmission transmission) {
//		this.transmission = transmission;
//		return this;
//	}
//	CarBuilder buildMaxSpeed(int maxSpeed) {
//		this.maxSpeed = maxSpeed;
//		return this;
//	}
//	Car build() {
//		Car car = new Car();
//		car.setMake(make);
//		car.setTransmission(transmission);
//		car.setMaxSpeed(maxSpeed);
//		return car;
//	}
//}
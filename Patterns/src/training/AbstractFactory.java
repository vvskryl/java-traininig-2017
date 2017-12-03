package training;

/**
 * Created by Viacheslav Skryl on 16.11.2017
 */

public class AbstractFactory {

	public static void main(String[] args) {
		
		DeviceFactory f = getDeviceFactoryByCountryCode("UA");
		Mouse m = f.getMouse();
		Keyboard k = f.getKeyboard();
		Touchpad t = f.getTouchpad();
		
		m.dblclick();
		k.println();
		t.track(5, 7);
	}

	private static DeviceFactory getDeviceFactoryByCountryCode (String countryCode) {
		switch(countryCode) {
			case "UA": return new UkDeviceFactory();
			case "EN": return new EnDeviceFactory();
			default: throw new RuntimeException("Unsupported country code: "
												+ countryCode);
		}
	}
}

interface Mouse {
	void click();
	void dblclick();
	void scroll(int direction);
}

interface Keyboard {
	void print();
	void println();
}

interface Touchpad {
	void track(int dX, int dY);
}

interface DeviceFactory {
	Mouse getMouse();
	Keyboard getKeyboard();
	Touchpad getTouchpad();
}

class EnMouse implements Mouse {
	public void click() {System.out.println("Mouse click");}
	public void dblclick() {System.out.println("Mouse double click");}
	public void scroll(int direction) {
		if (direction < 0) System.out.println("Scroll down");
		else if (direction > 0) System.out.println("Scroll up");
		else System.out.println("No scrolling");
	}	
}

class EnKeyboard implements Keyboard {
	public void print() {System.out.print("Print");}
	public void println() {System.out.println("Print line");}
}

class EnTouchpad implements Touchpad {
	public void track(int dX, int dY) {System.out.println("Moved [" + dX + "," + dY + "]");}
}

class UkMouse implements Mouse {
	public void click() {System.out.println("Клік мишею");}
	public void dblclick() {System.out.println("Подвійний клік мишею");}
	public void scroll(int direction) {
		if (direction < 0) System.out.println("Скролимо униз");
		else if (direction > 0) System.out.println("Скролимо уверх");
		else System.out.println("Не скролимо");
	}	
}

class UkKeyboard implements Keyboard {
	public void print() {System.out.print("Друк");}
	public void println() {System.out.println("Друк з новою строкою");}
}

class UkTouchpad implements Touchpad {
	public void track(int dX, int dY) {System.out.println("Рух [" + dX + "," + dY + "]");}
}

class EnDeviceFactory implements DeviceFactory {
	public Mouse getMouse() {return new EnMouse();}
	public Keyboard getKeyboard() {return new EnKeyboard();}
	public Touchpad getTouchpad() {return new EnTouchpad();}
}

class UkDeviceFactory implements DeviceFactory {
	public Mouse getMouse() {return new UkMouse();}
	public Keyboard getKeyboard() {return new UkKeyboard();}
	public Touchpad getTouchpad() {return new UkTouchpad();}
}
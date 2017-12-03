package training;

/**
 * Created by Viacheslav Skryl on 16.11.2017
 */

public class Decorator {

	public static void main(String[] args) {
		IPrinter printer = new DecoratorQuotes(new Printer("Hello"));
		printer.print();
		System.out.println("");
		printer = new DecoratorLeftBracket(new DecoratorRightBracket(new Printer("Hello")));
		printer.print();
	}
}

interface IPrinter {
	void print();
}

class Printer implements IPrinter {
	String value;
	public Printer(String value) { this.value = value; }
	public void print() { System.out.print(value); }
}

abstract class DecoratorBase implements IPrinter {
	IPrinter printer;
	public DecoratorBase(IPrinter printer) { this.printer = printer; }
	public void print() { printer.print(); }
}

class DecoratorQuotes extends DecoratorBase {
	public DecoratorQuotes(IPrinter printer) { super(printer); }
	public void print() {
		System.out.print("\"");
		super.print();
		System.out.print("\"");
	}
}

class DecoratorLeftBracket extends DecoratorBase {
	public DecoratorLeftBracket(IPrinter printer) { super(printer); }
	public void print() {
		System.out.print("[");
		super.print();
	}
}

class DecoratorRightBracket extends DecoratorBase {
	public DecoratorRightBracket(IPrinter printer) { super(printer); }
	public void print() {
		super.print();
		System.out.print("]");
	}
}
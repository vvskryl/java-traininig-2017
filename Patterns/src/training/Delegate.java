package training;

/**
 * @author
 * Created by Viacheslav Skryl on 25.11.2017
 */

public class Delegate {

	public static void main(String[] args) {
		B b = new B();
		b.f();
		
		Painter painter = new Painter();
		painter.setGraphics(new Square());
		painter.draw();
		
		painter.setGraphics(new Triangle());
		painter.draw();
	}	
}

class A{
	void f() {
		System.out.println("f()");
	}
}

class B{
	A a = new A();
	void f() {
		a.f();
	}
}

interface IGraphics {
	void draw();
}

class Triangle implements IGraphics {
	public void draw() {
		System.out.println("Draw triangle");
	}
}

class Circle implements IGraphics {
	public void draw() {
		System.out.println("Draw circle");
	}
}

class Square implements IGraphics {
	public void draw() {
		System.out.println("Draw square");
	}
}

class Painter {
	IGraphics graphics;
	void setGraphics(IGraphics g) {
		graphics = g;
	}
	void draw() {
		graphics.draw();
	}
}
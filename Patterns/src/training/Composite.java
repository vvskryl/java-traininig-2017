package training;

import java.util.ArrayList;

/**
 * @author
 * Created by Viacheslav Skryl on 25.11.2017
 */

public class Composite {
	public static void main(String[] args) {
		IShape square1 = new ShapeSquare();
		IShape square2 = new ShapeSquare();
		IShape triangle1 = new ShapeTriangle();
		
		IShape circle1 = new ShapeCircle();
		IShape circle2 = new ShapeCircle();
		IShape triangle2 = new ShapeTriangle();
		IShape triangle3 = new ShapeTriangle();
		
		ShapeComposite composite1 = new ShapeComposite();
		ShapeComposite composite2 = new ShapeComposite();
		ShapeComposite composite3 = new ShapeComposite();
		
		composite1.addComponent(square1);
		composite1.addComponent(square2);
		composite1.addComponent(triangle1);
		
		composite2.addComponent(circle1);
		composite2.addComponent(circle2);
		composite2.addComponent(triangle2);
		composite2.addComponent(triangle3);
		
		composite3.addComponent(composite1);
		composite3.addComponent(composite2);
		
		composite3.draw();
	}
}

interface IShape {
	void draw();
}

class ShapeTriangle implements IShape {
	public void draw() {
		System.out.println("Draw triangle");
	}
}

class ShapeCircle implements IShape {
	public void draw() {
		System.out.println("Draw circle");
	}
}

class ShapeSquare implements IShape {
	public void draw() {
		System.out.println("Draw square");
	}
}

class ShapeComposite implements IShape {
	private ArrayList<IShape> components = new ArrayList<>();
	
	public void addComponent(IShape component) {
		components.add(component);
	}
	public void removeComponent(IShape component) {
		components.remove(component);
	}
	
	public void draw() {
		for (IShape component: components) {
			component.draw();
		}
	}
}
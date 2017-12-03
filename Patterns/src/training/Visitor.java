package training;

/**
 * @author
 * Created by Viacheslav Skryl on 25.11.2017
 */

public class Visitor {
	public static void main(String[] args) {
//		IElement engine = new EngineElement();
//		IElement body = new BodyElement();
//		IVisitor hooligan = new HooliganVisitor();
//		
//		engine.accept(hooligan);
//		body.accept(hooligan);
		
		IElement car = new CarElement();
		car.accept(new HooliganVisitor());
		System.out.println();
		car.accept(new MechanicVisitor());
	}
}

interface IVisitor {
	void visit(EngineElement engine);
	void visit(BodyElement body);
	void visit(CarElement car);
	void visit(WheelElement wheel);
} 

interface IElement {
	void accept(IVisitor visitor);
}
class EngineElement implements IElement {
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
class BodyElement implements IElement {
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
class WheelElement implements IElement {
	private String name;
	
	public WheelElement(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
class CarElement implements IElement {
	IElement elements[];
	
	public CarElement() {
		this.elements = new IElement[] { new WheelElement("Front right"),
			new WheelElement("Front left"), new WheelElement("Back left"),
			new WheelElement("Back right"), new EngineElement(),
			new BodyElement() };
	}
	
	public void accept(IVisitor visitor) {
		for (IElement e: elements) {
			e.accept(visitor);
		}
		visitor.visit(this);
	}
}
	
class HooliganVisitor implements IVisitor {
	@Override
	public void visit(EngineElement engine) {
		System.out.println("Start engine");	
	}
	@Override
	public void visit(BodyElement body) {
		System.out.println("Knock body");
	}
	@Override
	public void visit(CarElement car) {
		System.out.println("Smoke in the car");		
	}
	@Override
	public void visit(WheelElement wheel) {
		System.out.println("Hit " + wheel.getName() + " wheel");
	}
}
class MechanicVisitor implements IVisitor {
	@Override
	public void visit(EngineElement engine) {
		System.out.println("Check engine");	
	}
	@Override
	public void visit(BodyElement body) {
		System.out.println("Clean body");
	}
	@Override
	public void visit(CarElement car) {
		System.out.println("Look at the car");
	}
	@Override
	public void visit(WheelElement wheel) {
		System.out.println("Pump up " + wheel.getName() + " wheel");
	}
}

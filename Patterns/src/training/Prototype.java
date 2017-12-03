package training;

/**
 * @author
 * Created by Viacheslav Skryl on 25.11.2017
 */

public class Prototype {
	public static void main(String[] args) {
		Human human = new Human(18, "John");
		System.out.println(human);
		
		Human clone = (Human)human.copy();
		System.out.println(clone);
		
		HumanFactory factory = new HumanFactory(clone);
		Human h1 = factory.makeCopy();
		System.out.println(h1);
		
		factory.setPrototype(new Human(20, "Alex"));
		Human h2 = factory.makeCopy();
		System.out.println(h2);
	}
}

interface ICopyable {
	Object copy();
}

class Human implements ICopyable {
	int age;
	String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Object copy() {
		Human copy = new Human(age, name);
		return copy;
	}
	
	public String toString() {
		return "Human [age=" + age + ",name=" + name + "]";
	}
}

class HumanFactory {
	Human human;
	
	public HumanFactory(Human human) {
		setPrototype(human);
	}
	public void setPrototype(Human human) {
		this.human = human;
	}
	Human makeCopy() {
		return (Human)human.copy();
	}
}
package training;

/**
 * Check "instanceof" function
 * Created by Viacheslav Skryl on 05.11.2017
 */

public class TaskInstanceof {

	public static void main(String[] args) {
		class Parent {
		}
		Parent parent = new Parent();
		
		class Child extends Parent {
		}
		Child child = new Child();
		
		class Child1 extends Parent {
		}
		Child1 child1 = new Child1();
		
		class ChildChild extends Child {
		}
		ChildChild childChild = new ChildChild();
		
		System.out.println("Child to Parent = " + (child instanceof Parent));
		System.out.println("Child1 to Parent = " + (child1 instanceof Parent));
		System.out.println("ChildChild to Child = " + (childChild instanceof Child));
		System.out.println("ChildChild to Parent = " + (childChild instanceof Parent));
		//System.out.println("Child1 to Child = " + (child1 instanceof Child));
		System.out.println("ChildChild to Child1 = " + (childChild instanceof Parent));
		System.out.println("Parent to ChildChild = " + (parent instanceof ChildChild));
	}

}

package training;

/**
 * @author
 * Created by Viacheslav Skryl on 25.11.2017
 */

public class Iterator {

	public static void main(String[] args) {
		ConcreteAggregate c = new ConcreteAggregate();
		
		IIterator i = c.getIterator();
		
		while(i.hasNext()) {
			System.out.println((String)i.next());
		}
	}

}

interface IIterator {
	boolean hasNext();
	Object next();
}

interface IAggregate {
	IIterator getIterator();
}

class ConcreteAggregate implements IAggregate {
	String [] tasks = {"First task", "Second task", "Third task"};

	@Override
	public IIterator getIterator() {
		return new TaskIterator();
	}
	
	public class TaskIterator implements IIterator {
		int index = 0;
		
		@Override
		public boolean hasNext() {
			if (index < tasks.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			return tasks[index++];
		}
		
	}
}
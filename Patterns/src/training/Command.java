package training;

/**
 * @author
 * Created by Viacheslav Skryl on 25.11.2017
 */

public class Command {
	public static void main(String[] args) {
		Comp comp = new Comp();
		User user = new User(new StartCommand(comp),
							 new StopCommand(comp), 
							 new ResetCommand(comp));
		
		user.startComp();
		user.stopComp();
		user.resetComp();
	}
}

interface ICommand {
	void execute();
}
//Reciever
class Comp {
	void start() {
		System.out.println("Start");
	}
	void stop() {
		System.out.println("Stop");
	}
	void reset() {
		System.out.println("Reset");
	}
}

class StartCommand implements ICommand {
	Comp comp;
	public StartCommand(Comp comp) { this.comp = comp; }
	@Override
	public void execute() {
		comp.start();
	}
}
class StopCommand implements ICommand {
	Comp comp;
	public StopCommand(Comp comp) { this.comp = comp; }
	@Override
	public void execute() {
		comp.stop();
	}
}
class ResetCommand implements ICommand {
	Comp comp;
	public ResetCommand(Comp comp) { this.comp = comp; }
	@Override
	public void execute() {
		comp.reset();
	}
}
//Invoker
class User {
	ICommand start;
	ICommand stop;
	ICommand reset;
	public User(ICommand start, ICommand stop, ICommand reset) {
		this.start = start;
		this.stop = stop;
		this.reset = reset;
	}
	void startComp() {
		start.execute();
	}
	void stopComp() {
		stop.execute();
	}
	void resetComp() {
		reset.execute();
	}
}
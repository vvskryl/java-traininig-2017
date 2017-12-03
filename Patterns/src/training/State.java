package training;

/**
 * @author
 * Created by Viacheslav Skryl on 25.11.2017
 */

public class State {
	public static void main(String[] args) {
//		IStation s1 = new Radio1();
//		Radio r = new Radio();
//		r.setStation(s1);
//		
//		for (int i = 0; i < 10; i++) {
//			r.play();
//			r.nextStation();
//		}
		
		ActiveHuman human = new ActiveHuman();
		human.setState(new Work());
		for (int i = 0; i < 10; i++) {
			human.doSmth();
		}
	}
}

//State
interface IStation {
	void play();
}
class Radio1 implements IStation {
	public void play() {
		System.out.println("Radio1...");
	}
}
class Radio2 implements IStation {
	public void play() {
		System.out.println("Radio2...");
	}
}
class Radio3 implements IStation {
	public void play() {
		System.out.println("Radio3...");
	}
}

//Context
class Radio {
	IStation station;
	
	void setStation(IStation station) {
		this.station = station;
	}
	void nextStation() {
		if (station instanceof Radio1)
			setStation(new Radio2());
		else if (station instanceof Radio2)
			setStation(new Radio3());
		else
			setStation(new Radio1());
	}
	void play() {
		station.play();
	}
}

//Context
class ActiveHuman {
	private IActivity state;
	
	public void setState(IActivity a) {
		this.state = a;
	}
	public void doSmth() {
		state.doSmth(this);
	}
}
//State
interface IActivity {
	void doSmth(ActiveHuman context);
}
class Work implements IActivity {
	public void doSmth(ActiveHuman context) {
		System.out.println("Work");
		context.setState(new Weekend());
	}
}
class Weekend implements IActivity {
	private int count = 3;
	public void doSmth(ActiveHuman context) {
		if (count != 0) {
			System.out.println("Rest");
			count--;
		}
		if (count == 0) {
			context.setState(new Work());
		}
	}
}
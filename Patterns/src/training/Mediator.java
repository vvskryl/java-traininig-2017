package training;

import java.util.ArrayList;

/**
 * @author
 * Created by Viacheslav Skryl on 25.11.2017
 */

public class Mediator {
	public static void main(String[] args) {
		TextChat chat = new TextChat();
		
		UserMediator admin = new Admin(chat, "Boss");
		UserMediator user1 = new SimpleUser(chat, "Alex");
		UserMediator user2 = new SimpleUser(chat, "John");
		UserMediator user3 = new SimpleUser(chat, "Hanna");
		
		chat.setAdmin(admin);
		chat.addUser(user1);
		chat.addUser(user2);
		chat.addUser(user3);
		
		user2.setEnable(false);
		
		user1.sendMessage("Hello");
		
		System.out.println();
		admin.sendMessage("Admin is here");
	}
}

abstract class UserMediator {
	IChat chat;
	String name;
	boolean isEnable = true;
	
	public UserMediator(IChat chat, String name) {
		this.chat = chat;
		this.name = name;
	}
	
	public boolean isEnable() {
		return isEnable;
	}
	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}
	public String getName() {
		return name;
	}
	
	public void sendMessage(String message) {
		chat.sendMessage(message, this);
	}
	abstract void recieveMessage(String message);
	
	public String toString() {
		return "User [name=" + name + "]";
	}
}
class Admin extends UserMediator {
	public Admin(IChat chat, String name) {
		super(chat, name);
	}
	
	public void recieveMessage(String message) {
		System.out.println("Admin " + getName() + " recieve: \"" + message + "\"");
	}
}
class SimpleUser extends UserMediator {
	public SimpleUser(IChat chat, String name) {
		super(chat, name);
	}
	
	public void recieveMessage(String message) {
		System.out.println("User " + getName() + " recieve: \"" + message + "\"");
	}
}

interface IChat {
	void sendMessage(String message, UserMediator user);
}
class TextChat implements IChat {
	UserMediator admin;
	ArrayList<UserMediator> users = new ArrayList<>();
	
	public void setAdmin(UserMediator admin) {
		if (admin != null && admin instanceof Admin)
			this.admin = admin;
		else
			throw new RuntimeException("Impossible action");
	}
	public void addUser(UserMediator user) {
		if (admin == null)
			throw new RuntimeException("There isn't an admin");
		else if (user instanceof SimpleUser)
			users.add(user);
		else
			throw new RuntimeException("Admin cannot use the chat");
	}
	
	@Override
	public void sendMessage(String message, UserMediator user) {
		if (user instanceof Admin)
			for (UserMediator u : users)
				u.recieveMessage(user.getName() + ": " + message);
		
		if (user instanceof SimpleUser) {
			for (UserMediator u : users)
				if (u != user && u.isEnable)
					u.recieveMessage(user.getName() + ": " + message);
			if (admin.isEnable)
				admin.recieveMessage(user.getName() + ": " + message);
		}
	}
}
package display;

import dto.Request;

import java.util.HashMap;

public class Display {
	
	private HashMap<Integer, String> menu = new HashMap<>();
	
	
	public void showMessages(Request request) {
		request.getMessages()
			   .forEach((m) -> System.out.println(m));
	}

	public void welcomeScreen() {
		menu.put(1,": add");
		menu.put(2,": remove");
		menu.put(3,": edit");
		
		System.out.println("_______ROJEC______");
		System.out.println("\nPlease select from the following:");
		menu.forEach((k,v) -> System.out.println(k + v));

	}	
}

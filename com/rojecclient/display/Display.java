package com.rojecclient.display;

import com.rojecclient.dto.Request;

import java.util.HashMap;

public class Display {

	private HashMap<Integer, String> menu = new HashMap<>();


	public void showMessages(Request request) {
		System.out.println("\nCurrent Message List:\n");
		request.getMessages()
			   .forEach((m) -> System.out.println(m));
		System.out.println("\nEnd of Message List\n");
	}

	public void welcomeScreen() {
		menu.put(1,": add");
		menu.put(2,": remove");
		menu.put(3,": edit");
		menu.put(4,": show all messages");

		System.out.println("_______ROJEC______");
		System.out.println("\nPlease select from the following:");
		menu.forEach((k,v) -> System.out.println(k + v));
	}
}

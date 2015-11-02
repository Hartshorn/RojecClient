package util;


import dto.Request;
import java.util.Random;
import java.util.Scanner;

public class Util {

	private static Random rng = new Random();
	private Scanner scanner = new Scanner(System.in);


	public static Request initRequest() {

		Request request = new Request();

		request.setId(generateId());

		return request;
	}

	public void initRequest(Request request) {
		request.setSelection(scanner.nextInt());
		scanner.nextLine();
	}

	public void addMessage(Request request) {
		System.out.println("Please type message to add: ");
		request.addMessage(scanner.nextLine());
	}

	private static Integer generateId() {
		return rng.nextInt(100);
	}
}

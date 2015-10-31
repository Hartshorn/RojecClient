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
	}


	private static Integer generateId() {
		return rng.nextInt(100);
	}
}

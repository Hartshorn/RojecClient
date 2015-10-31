package client;

import command.Command;
import constants.Constants;



public class Client {

	private static Command command = new Command();

	public static void main(String ... args) {
		
		command.proceed();

		System.out.println("You entered: " + command.getRequest().getSelection());

		command.proceed();
	}
}

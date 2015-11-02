package client;

import command.Command;
import constants.Constants;



public class Client {

	private static Command command = new Command();

	public static void main(String ... args) {
		do {
			command.proceed();
		} while (command.getStatus() != Command.Status.COMPLETE);
	}
}

package client;

import com.RojecService.service.RojecServiceImpl;

import command.Command;
import constants.Constants;
import util.Util;



public class Client {

	private static Command command = new Command();

	//public static void main(String ... args) {
		//do {
			//command.proceed();
		//} while (command.getStatus() != Command.Status.COMPLETE);
	//}

	public static void connect() {
		RojecServiceImpl service = Util.setupService();

		service.showAllDataItems();
	}
}

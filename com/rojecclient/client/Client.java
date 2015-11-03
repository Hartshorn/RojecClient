package com.rojecclient.client;

// when the service is imported - the generalized path ended up as this
// it can be compiled this way and will work, though it differs from the actual
// application (service) structure
import com.rojecservice.service.ServiceTunnel;
import com.rojecservice.service.RojecServiceImplService;

import com.rojecclient.command.Command;
import com.rojecclient.util.Util;

import static com.rojecclient.constants.Constants.*;



public class Client {

	private static Command command = new Command();

	public static void main(String ... args) {

		try {
			 RojecServiceImplService service = Util.setupService();

			 while (command.getStatus() != COMPLETE) {

				 //event loop - do everything here - return
				 // command.nextIteration()


			 }

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

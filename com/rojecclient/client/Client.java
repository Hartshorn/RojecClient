package com.rojecclient.client;

// when the service is imported - the generalized path ended up as this
// it can be compiled this way and will work, though it differs from the actual
// application (service) structure
import com.rojecservice.service.ServiceTunnel;
import com.rojecservice.service.RojecService;

import com.rojecclient.command.Command;
import com.rojecclient.util.Util;

import static com.rojecclient.constants.Constants.*;



public class Client {

	private static Command command = new Command();

	public static void main(String ... args) {

		try {
			 RojecService service = Util.setupService();

			 while (command.getStatus() != COMPLETE) {

				 ServiceTunnel getItemTunnel = new ServiceTunnel();
				 getItemTunnel.setChoice(5);
				 getItemTunnel.setId(63);

				 service.process(getItemTunnel);

				 System.out.println("Message: " + getItemTunnel.getMessage());
				 System.out.println("Name: " 		+ getItemTunnel.getName());
				 System.out.println("City: " 		+ getItemTunnel.getCity());
				 System.out.println("State: " 	+ getItemTunnel.getState());

				 command.setStatus(COMPLETE);

			 }

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

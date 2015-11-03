package com.rojecclient.client;

// when the service is imported - the generalized path ended up as this
// it can be compiled this way and will work, though it differs from the actual
// application (service) structure
import com.rojecservice.service.RojecService;
import com.rojecservice.service.Request;
import com.rojecservice.service.Option;

import com.rojecclient.command.Command;
import com.rojecclient.util.Util;



public class Client {

	private static Command command = new Command();

	public static void main(String ... args) {
		try {
			RojecService service = Util.setupService();
			service.showAllDataItems();

			//TODO: import the WSDL from the running service, then build your
			// service.Request off of that (including the option); the service
			// side should stay the same.

			Option option = new Option();
			option.setChoice(2);
			option.setMessage("added new item");
			option.setName("Jack's shop");
			option.setCity("Chicago");
			option.setState("IL");

			Request request = new Request();
			request.setOption(option);

			service.addNewItem(request);
			service.showAllDataItems();


		} catch (Exception e) {
				System.out.println(e.toString());
		}

	}
}

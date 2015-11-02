package com.rojecclient.client;

import com.rojecservice.service.RojecService;
import com.rojecservice.dto.Request;
import com.rojecservice.dto.Option;

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

			Request request = new Request(new Option(//add fields));

			service.addNewItem(request);

			service.showAllDataItems();


		} catch (Exception e) {
				System.out.println(e.toString());
		}

	}
}

package util;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

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

	public static RojecService setupService() throws Exception {
    URL wsdlUrl = new URL("http://localhost:8888/rojec?wsdl");
    QName qname = new QName("http://webservice/", "RojecServiceImplService");
    Service service = Service.create(wsdlUrl, qname);
    return service.getPort(RojecService.class);
  }
}

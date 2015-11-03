package com.rojecclient.util;

import com.rojecservice.service.RojecServiceImplService;
import com.rojecclient.dto.Request;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

import java.util.Random;
import java.util.Scanner;

public class Util {

	private static Random rng = new Random();
	private Scanner scanner = new Scanner(System.in);


	public static RojecServiceImplService setupService() throws Exception {
    URL wsdlUrl = new URL("http://localhost:8888/rojec?wsdl");
    QName qname = new QName("http://service.rojecservice.com/", "RojecServiceImplService");
    Service service = Service.create(wsdlUrl, qname);
    return service.getPort(RojecServiceImplService.class);
  }
}

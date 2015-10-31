package command;

import util.Util;
import dto.Request;
import display.Display;
import constants.Constants;


public class Command {

	private static Request request;
	private static Util util = new Util();
	private static Display display = new Display();
	
	
	private enum MenuChoice { DISPLAY_MENU, SHOW_ALL_MESSAGES };
	private enum Status { INIT, DISPLAY, REQUEST, RETURN };

	private Status status;

	public Command() {
		this.status = Status.INIT;	
		this.request = util.initRequest();
	}

	public void proceed() {

		switch (this.status) {

			case INIT:
				show(MenuChoice.DISPLAY_MENU);
				util.initRequest(request);
				this.status = Status.REQUEST;
				break;
			
			case DISPLAY:
				show(MenuChoice.SHOW_ALL_MESSAGES);
				this.status = Status.REQUEST;
				break;

			default:
				show(MenuChoice.DISPLAY_MENU);
				break;
		}

	}

	public Request getRequest() {
		return this.request;
	}

	public Boolean addMessage(String s) {
		return this.request.addMessage(s);
	}

	public void show(MenuChoice m) {
		switch (m) {
			case DISPLAY_MENU:
				display.welcomeScreen();
				break;
			case SHOW_ALL_MESSAGES:
				display.showMessages(request);
				break;
			default:
				System.out.println("ERROR");
				break;
		}
	}
	
	

}

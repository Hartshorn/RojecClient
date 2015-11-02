package com.rojecclient.command;

import com.rojecclient.util.Util;
import com.rojecclient.dto.Request;
import com.rojecclient.display.Display;


public class Command {

	private static Request request;
	private static Util util = new Util();
	private static Display display = new Display();


	private enum MenuChoice { DISPLAY_MENU, SHOW_ALL_MESSAGES };
	public enum Status { INIT, DISPLAY, REQUEST, RETURN, COMPLETE };

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
				this.status = Status.DISPLAY;
				break;

			case DISPLAY:
				Integer selection = request.getSelection();

				if (selection == 4) {

					show(MenuChoice.SHOW_ALL_MESSAGES);
					this.status = Status.INIT;

				} else if (selection == 1) {

					util.addMessage(request);
					this.status = Status.INIT;

				} else {
					this.status = Status.COMPLETE;
				}
				break;

			case REQUEST:
				this.status = Status.RETURN;
				break;

			case RETURN:
				this.status = Status.COMPLETE;
				return;

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

	public Status getStatus() {
		return this.status;
	}


}

package dto;

import java.util.List;
import java.util.ArrayList;

public class Request implements Messenger {

	private Integer id;
	private List<String> messages = new ArrayList<>();
	private Integer selection;


	@Override
	public Integer getId() {
		return this.id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSelection() {
		return this.selection;
	
	}

	public void setSelection(Integer n) {
		this.selection = n;
	}

	public List<String> getMessages() {
		return this.messages;
	}

	public Boolean addMessage(String message) {
		return messages.add(message);
	}
}

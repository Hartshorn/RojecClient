package dto;

import java.util.List;
import java.util.ArrayList;


public class Response implements Messenger {

	private Integer id;
	private Boolean status;


	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}

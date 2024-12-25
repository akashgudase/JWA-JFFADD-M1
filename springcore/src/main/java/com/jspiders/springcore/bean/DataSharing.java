package com.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DataSharing {

	@Autowired
	@Qualifier(value = "whatsapp")
	private Messanger messanger;

	@Override
	public String toString() {
		return "DataSharing [messanger=" + messanger + "]";
	}

}

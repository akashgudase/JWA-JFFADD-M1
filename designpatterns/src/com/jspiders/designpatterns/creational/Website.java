package com.jspiders.designpatterns.creational;

public class Website {

	private String domain;
	private String host;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Website [domain=" + domain + ", host=" + host + "]";
	}

}

package com.example;

/**
 * @author David Turanski
 **/
public class Response {
	private String value;
	private MyProperties configProps;

	public Response(MyProperties configProps, String value) {
		this.configProps = configProps;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public MyProperties getConfigProps() {
		return configProps;
	}

}

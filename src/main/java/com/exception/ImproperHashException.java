package com.exception;

public class ImproperHashException extends Exception {
	private static final long serialVersionUID = 6900198138469640504L;
	public ImproperHashException(String s) {
		super(s);
	}
	public ImproperHashException() {
		super();
	}
}

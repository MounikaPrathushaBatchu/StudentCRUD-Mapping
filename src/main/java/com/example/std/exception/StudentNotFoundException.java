package com.example.std.exception;

public class StudentNotFoundException extends RuntimeException{
	
	public StudentNotFoundException() {
		super();
	}
	public StudentNotFoundException(String msg) {
		super(msg);
	}
}

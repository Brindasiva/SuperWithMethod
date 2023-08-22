package com.brinda.javasamples;

public class Student extends Person {
	
	void message() {
		System.out.println("This is Student class:");
	}
	
	void display() {
		
		message();
		
		
		super.message();
	}

}

package com.te.springannotations.configuration;

import com.te.springannotations.interfaces.Animal;

public class Gorilla implements Animal{

	@Override
	public void eat() {
		System.out.println("Gorilla is eating Banana....");	
	}

	@Override
	public void sound() {
		System.out.println("Gorilla Snoring.....");
	}

	@Override
	public void type() {
		System.out.println("Gorilla is omnivorus.....");
	}

}

package com.te.springannotations.configuration;

import com.te.springannotations.interfaces.Animal;

public class Godzilla implements Animal{

	@Override
	public void eat() {
		System.out.println("GodZilla eats Humans......");
	}

	@Override
	public void sound() {
		System.out.println("Godzilla sounds echo......");
	}

	@Override
	public void type() {
		System.out.println("GodZilla is carnivorous......");
	}

}

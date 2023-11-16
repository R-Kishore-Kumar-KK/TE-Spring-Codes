package com.te.springannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springannotations.beans.Pet;
import com.te.springannotations.interfaces.Animal;

@Configuration
public class PetConfig {

	@Bean
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Lucifer");
		return pet;
	}
	
	@Bean("god")
	public Animal getGodzilla() {
		return new Godzilla();
	}
	
	@Bean("gor")
	public Animal getGorilla() {
		return new Gorilla();
	}
}

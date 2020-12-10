package com.clearminds.model;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager personaManager = new PersonaManager();
		
		personaManager.insertarPersona(new Persona("Luis", "Casa", 25));

	}

}

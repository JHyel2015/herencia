package com.clearminds.test;

import com.clearminds.model.Persona;
import com.clearminds.model.PersonaManager;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager personaManager = new PersonaManager();
		
		personaManager.insertarPersona(new Persona("Luis", "Casa", 25));

	}

}

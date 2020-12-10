package com.clearminds.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.model.Persona;
import com.clearminds.model.PersonaManager;

public class TestManager {

	public static void main(String[] args) {

		PersonaManager personaManager;
		try {
			personaManager = new PersonaManager();
			personaManager.insertarPersona(new Persona("Luis", "Casa", 25));
		} catch (InstanceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}

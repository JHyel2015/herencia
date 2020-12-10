package com.clearminds.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {
	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		super();
		Class<?> clase;
		String propiedad = leerPropiedad("propiedad1");
		try {
			clase = Class.forName(propiedad);
			this.serv = (ServicioPersona) clase.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}

	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}
	
	private String leerPropiedad(String propiedad) throws InstanceException {

		Properties p = new Properties();
		try {
			p.load(new FileReader("config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (IOException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
		return p.getProperty(propiedad);
	}

}

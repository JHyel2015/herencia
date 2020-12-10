package com.clearminds.model;

public class PersonaManager {
	private ServicioPersona serv;

	public PersonaManager() {
		super();
		this.serv = new ServicioPersonaBDD();
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
	
	
}

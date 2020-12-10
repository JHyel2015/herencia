package com.clearminds.model;

public class ServicioPersonaArchivos implements ServicioPersona{

	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en la BDD " + persona);
		return true;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en la BDD " + persona);
		return true;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en la BDD " + persona);
		return true;
	}

}

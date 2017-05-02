package com.ipartek.ejemplos.estibalizalvarez.tipos;

public class Usuario {
	private String nombre;
	private String pass;
	private String errores;

	// TO STRING;
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", pass=" + pass + "]";
	}

	// get y set.

	public String getNombre() {
		return nombre;
	}

	public String getErrores() {
		return errores;
	}

	public void setErrores(String errores) {
		this.errores = errores;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	// CONSTRUCTOR:
	public Usuario(String nombre, String pass) {
		super();
		this.nombre = nombre;
		this.pass = pass;
	}

	// constructor vacio.
	public Usuario() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}

	// HASCODE Y EQUALS:
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		return true;
	}

}

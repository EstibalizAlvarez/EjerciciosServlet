package com.ipartek.ejemplos.estibalizalvarez.dal;

public class DALFactory {
	public static UsuariosDAL getUsuariosDAL() {
		// return new UsuariosDalUsuarioUnico();
		return new UsuariosDALColeccion();
	}
}

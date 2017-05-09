package com.ipartek.ejemplos.estibalizalvarez.dal;

public class DALFactory {
	public static UsuariosDAL getUsuariosDAL() {//
		// return new UsuariosDalUsuarioUnico();
		return new UsuariosDALColeccion();
		/*
		 * si en cada una de las servles tienes 50 ficheros y hay que cambirlo en todos uno a uno y puede que alguno no lo hagas, entonces en las dos servles le cambiar por la clase DALfactory y se cambian todas a la vez. usuariosDal=DALFactory.getUsuariosDAL();
		 */
	}
}

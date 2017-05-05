package com.ipartek.ejemplos.estibalizalvarez.dal;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.ejemplos.estibalizalvarez.tipos.Usuario;

public class UsuariosDalColeccion implements UsuariosDAL {// TE COLOCAS EN USUARIOSDAL COLECCION Y LE DA IMPLEMENTAR METODOS.

	private Map<String, Usuario> usuarios = new HashMap<String, Usuario>();// crear una lista grande para meter varios usuarios.

	@Override
	public void alta(Usuario usuario) {
		// Para dar de alta al usuario
		usuarios.put(usuario.getNombre(), usuario);// es para introducir a un usuario con el identificador de nombre de usuario.
	}// alta

	@Override
	public boolean validar(Usuario usuario) {//
		// para validar un usuario:
		return usuarios.containsValue(usuario);//
	}// validar

}// usuariosDalColeccion

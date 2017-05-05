package com.ipartek.ejemplos.estibalizalvarez.dal;

import com.ipartek.ejemplos.estibalizalvarez.tipos.Usuario;

public class UsuariosDALUsuarioUnico implements UsuariosDAL {

	private Usuario usuario;

	@Override
	public void alta(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public boolean validar(Usuario usuario) {
		return this.usuario != null && this.usuario.equals(usuario);
	}

}

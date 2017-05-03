package com.ipartek.ejerciciosjavi;

import com.ipartek.ejemplos.javierlete.tipos.Usuario;

public class UsuariosDALFijo implements UsuariosDAL {

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

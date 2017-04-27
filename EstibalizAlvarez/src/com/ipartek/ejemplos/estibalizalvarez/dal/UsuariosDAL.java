package com.ipartek.ejemplos.estibalizalvarez.dal;

import com.ipartek.ejemplos.estibalizalvarez.tipos.Usuario;

public interface UsuariosDAL {
	public void alta(Usuario usuario);// para dar de alta al usuario

	public boolean validar(Usuario usuario);// para validar un usuario existente.

}

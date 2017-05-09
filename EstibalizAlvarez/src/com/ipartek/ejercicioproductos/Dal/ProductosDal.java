package com.ipartek.ejercicioproductos.Dal;

import com.ipartek.ejercicioproductos.Productos1;

public interface ProductosDal {

	public void alta(Productos1 conjunto);// para dar de alta a los productos.Creas una variable llamara de la Clase Productos.

	public void modificar(Productos1 conjunto);// para modificar un producto existente.

	public void baja(Productos1 conjunto);// para borrar un producto existente.

	public void buscar(Productos1 conjunto);// para buscar un producto existente.

}// interface

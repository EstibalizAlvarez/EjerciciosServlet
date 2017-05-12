package com.ipartek.ejercicioproductos.Dal;

import com.ipartek.ejercicioproductos.Productos1;

public interface ProductosDal {// aqui indicas los metodos.

	public void alta(Productos1 conjunto);// para dar de alta a los productos.Creas una variable llamara de la Clase Productos.

	public void modificar(Productos1 conjunto);// para modificar un producto existente.

	public void baja(Productos1 conjunto);// para borrar un producto existente.

	public Productos1 buscarPorId(String id);

	public Productos1[] buscarTodos();// para buscar un producto existente por id.

}// interface

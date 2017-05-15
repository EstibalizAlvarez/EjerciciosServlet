package com.ipartek.ejemplos.estibalizalvarez.dal;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.ejercicioproductos.Productos1;
import com.ipartek.ejercicioproductos.Dal.ProductosDal;

public class ProductosDALColeccion implements ProductosDal {// DalColeccion esta obligado a hacer la funciones de ProductosDal.

	// crear la coleccion (bolsa grande para meter varios productos)llamada productosColeccion:
	private Map<String, Productos1> productosColeccion = new HashMap<String, Productos1>();

	@Override
	public void alta(Productos1 conjunto) {
		if (productosColeccion.containsKey(conjunto.getId()))// si en la coleccion"productosColeccion" del conjunto de metodos de "productosDal" el Id que me ponesya esixte:
			throw new ProductosYAExistenteDALException("El producto ya existe." + conjunto.getId());// sale este mensaje.
		// me falta esto de hacer.
		productosColeccion.put(conjunto.getId(), conjunto);// Indice: para el id(clave) de producto que me has metido y te doy toda la informacion.
	}

	@Override
	public void modificar(Productos1 conjunto) {
		//

	}

	@Override
	public void baja(Productos1 conjunto) {
		//

	}

	@Override
	public Productos1 buscarPorId(String id) {

		return productosColeccion.get(id);
	}

	@Override
	public Productos1[] buscarTodos() {
		// que todos los productos los meta en un array:
		return productosColeccion.values().toArray(new Productos1[productosColeccion.size()]);// y te mide lo que ocupa procutosColeccion.

	}
}

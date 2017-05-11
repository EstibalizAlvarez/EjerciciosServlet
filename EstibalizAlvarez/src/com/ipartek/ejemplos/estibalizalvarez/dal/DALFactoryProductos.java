package com.ipartek.ejemplos.estibalizalvarez.dal;

import com.ipartek.ejercicioproductos.Dal.ProductosDal;

public class DALFactoryProductos {

	public static ProductosDal getProductosDAL() {//

		return new ProductosDALColeccion();
	}

}// DALFactory.

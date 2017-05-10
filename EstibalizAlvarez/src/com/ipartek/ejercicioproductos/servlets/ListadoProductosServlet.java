package com.ipartek.ejercicioproductos.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ejemplos.estibalizalvarez.dal.DALFactory;
import com.ipartek.ejercicioproductos.Dal.ProductosDal;

@WebServlet("/ListadoProductosServlet")
public class ListadoProductosServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ListadoProductosServlet() {// constructor vacio.
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);// doget llama al dopost.
	}// doget

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();// guarda en application el contenido que se envia de sla servlet.

		ProductosDal acciones = (ProductosDal) application.getAttribute("acciones"); // acciones primero se le llama al conjunto de ProductosDal.el conjunto de productos guardame un producto de la clase ProductosDal, sino lo meteria en algo global.
		if (acciones == null) {// si los datos introducidos al principio son nulos (vacios).
			acciones = DALFactory.getProductosDAL();// cambiame todos los datos de ProductosDAL y guardamelo en acciones.

		}

	}// dopost

}

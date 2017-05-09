package com.ipartek.ejercicioproductos.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		ProductosDal acciones = (ProductosDal) application.getAttribute("acciones");
		// UsuariosDAL dal = (UsuariosDAL) application.getAttribute("dal");
	}// dopost

}

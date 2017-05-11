package com.ipartek.ejercicioproductos.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ejemplos.estibalizalvarez.dal.DALFactoryProductos;
import com.ipartek.ejercicioproductos.Productos1;
import com.ipartek.ejercicioproductos.Dal.ProductosDal;

@WebServlet("/ListadoProductosServlet")
public class ListadoProductosServlet extends HttpServlet {
	static final String LISTADO_PRODUCTOS = "WEB-INF/vistas/ProductosCrud.jsp";
	private static final long serialVersionUID = 1L;

	public ListadoProductosServlet() {// constructor vacio.
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);// doget llama al dopost.
	}// doget

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();// creando la bolsa comun, guarda en application el contenido que se envia de a la servlet.

		ProductosDal acciones = (ProductosDal) application.getAttribute("acciones"); // acciones primero se le llama al conjunto de ProductosDal.el conjunto de productos guardame un producto de la clase ProductosDal, sino lo meteria en algo global.

		if (acciones == null) {// si los datos introducidos al principio son nulos (vacios).
			acciones = DALFactoryProductos.getProductosDAL();// cambiame todos los datos de ProductosDAL y guardamelo en acciones.
			acciones.alta(new Productos1("1", "Boligrafo", "Utensilio para escribir", 25));// dando de alta un producto. de la clase Productos1 siguiendo el constructor.
			acciones.alta(new Productos1("2", "Mesa", "Moviliario para la cocina", 250));// el precio es un int(numero)nunca va entre comillas.

			application.setAttribute("acciones", acciones);// tarjeta de visita. Que siempre sea el mismo bibliotecario.
		}

		String opcion = request.getParameter("opcion");// si en la url pones:(?opcion):
		if (opcion == null) {
			Productos1[] listaProductos = acciones.buscarId();// en el array va la listaProductos encontrado.
			request.setAttribute("listaProductos", listaProductos);
			request.getRequestDispatcher(LISTADO_PRODUCTOS).forward(request, response);// te manda a la pagina productoscrud.
		}// if

	}// dopost
}

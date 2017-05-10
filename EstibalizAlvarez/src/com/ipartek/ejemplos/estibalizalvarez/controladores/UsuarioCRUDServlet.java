package com.ipartek.ejemplos.estibalizalvarez.controladores;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ejemplos.estibalizalvarez.dal.DALFactory;
import com.ipartek.ejemplos.estibalizalvarez.dal.UsuariosDAL;
import com.ipartek.ejemplos.estibalizalvarez.tipos.Usuario;

@WebServlet("/usuariocrud")
public class UsuarioCRUDServlet extends HttpServlet {
	static final String RUTA_FORMULARIO = "/WEB-INF/vistas/usuarioform.jsp";
	static final String RUTA_LISTADO = "/WEB-INF/vistas/usuariocrud.jsp";
	static final String RUTA_SERVLET_LISTADO = "/usuariocrud";

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();

		UsuariosDAL dal = (UsuariosDAL) application.getAttribute("dal");// dal primero se le llama al conjunto de UsuariosDal.el conjunto de usuarios guardame un usuario de la clase UsuariosDal, sino lo meteria en algo global.

		if (dal == null) {// si los datos introducidos al principio son nulos (vacios).
			dal = DALFactory.getUsuariosDAL();//

			dal.alta(new Usuario("usuario1", "pass1"));// dar de alta a un usuario. con el nombre "usuario1" y contraseña "pass1"
			dal.alta(new Usuario("usuario2", "pass2"));//

			application.setAttribute("dal", dal);// tarjeta visita. siemptre al mismo.
		}

		String op = request.getParameter("op");// creas la variable op de tipo String. GetParameter: captura el dato que va en el "op",que se envia en el request.

		if (op == null) {

			Usuario[] usuarios = dal.buscarTodosLosUsuarios();// crea un array de la clase Usuario llamado usuarios.

			request.setAttribute("usuarios", usuarios);// "usuarios" es el que va en el requestscope de la jsp y usuarios es el que se a creado en la fila anterior
			//
			request.getRequestDispatcher(RUTA_LISTADO).forward(request, response);
		} else {
			String id = request.getParameter("id");

			Usuario usuario;

			switch (op) {
			case "modificar":
			case "borrar":
				usuario = dal.buscarPorId(id);
				request.setAttribute("usuario", usuario);
			case "alta":
				request.getRequestDispatcher(RUTA_FORMULARIO).forward(request, response);
				break;
			default:
				request.getRequestDispatcher(RUTA_LISTADO).forward(request, response);
			}
		}
	}

}

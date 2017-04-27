package com.ipartek.formacion.estibalizalvarez.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/guardar")
public class GuardarDatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String dato = request.getParameter("dato");// "dato" es la clave, es lo que pones en la barra del navegador "?dato=......."

		HttpSession session = request.getSession();// la bolsa individual de cada usuario en los navegadores.

		session.setAttribute("dato", dato);// mete en la variable dato lo que se ha recogido en la "clave dato".

		ServletContext application = getServletContext();// bolsa comun para todo el mundo.

		application.setAttribute("todos", "Común");// en la bolsa todos mete comun.

		// request.getSession().setAttribute("dato", dato);
	}

}

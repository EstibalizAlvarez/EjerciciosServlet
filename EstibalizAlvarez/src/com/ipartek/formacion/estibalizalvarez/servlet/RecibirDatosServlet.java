package com.ipartek.formacion.estibalizalvarez.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/recibir")
public class RecibirDatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();// coges la bolsa individual.

		String dato = (String) session.getAttribute("dato");// recogeme el valor de "dato" en la variable dato.

		ServletContext application = getServletContext();// bolsa global para todo el mundo.

		String todos = (String) application.getAttribute("todos");//

		PrintWriter out = response.getWriter();// canal de escritura al navegador.
		out.println("El dato guardado en sesión es " + dato);
		out.println("El dato global en aplicación es " + todos);
	}

}

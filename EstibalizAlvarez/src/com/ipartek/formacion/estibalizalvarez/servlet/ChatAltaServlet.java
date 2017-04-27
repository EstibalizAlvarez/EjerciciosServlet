package com.ipartek.formacion.estibalizalvarez.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/alta")
public class ChatAltaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String usuario = request.getParameter("nombre");// "nombre" es la clave, es lo que pones en la barra del navegador "?nombre=......."
		HttpSession session = request.getSession();// creas la bolsa individual.
		session.setAttribute("nombre", usuario); // meter en usuario el valor de nombre.

		PrintWriter out = response.getWriter();// canal de escritura al navegador.
		out.println("El usuario es: " + usuario);// muestrame el nombre del usuario.
	}
}

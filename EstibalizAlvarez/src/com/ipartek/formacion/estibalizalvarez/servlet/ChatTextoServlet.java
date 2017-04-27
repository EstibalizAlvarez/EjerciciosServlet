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

@WebServlet("/texto")
public class ChatTextoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();// coges la bolsa individual. Recuerda quien es el usuario.
		String usuario = (String) session.getAttribute("nombre");// EL nombre de usuario de inicio de sesion.

		ServletContext application = getServletContext();// coges la bolsa global para que el texto que metas lo vea todo el mundo.
		String texto1 = request.getParameter("texto");// para guardar texto escrito en "textoescrito" en la variable texto1.
		application.setAttribute("textoGlobal", texto1);// se guarda en el textoGlobal el testo1 escrito anteriormente.

		PrintWriter out = response.getWriter();// canal de escritura al navegador.
		out.println(usuario + texto1);// aqui te saca el usuario y el texto que escribe.
	}

}

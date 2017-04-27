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
		String texto1 = request.getParameter("texto");// para guardar texto escrito en "texto" en la variable texto1.

		String textogrande = (String) application.getAttribute("textoGlobal");// sacas el texto de la bolsa.
		if (textogrande == null)// si la primera vez es null
			textogrande = usuario + texto1 + "<br/>";// sacame solo usuario y texto.
		else
			textogrande = textogrande + usuario + texto1 + "<br/>";// le sacas el texto existente y le añades usuario y texto nuevo.
		application.setAttribute("textoGlobal", textogrande);// se guarda en el textoGlobal todo.

		PrintWriter out = response.getWriter();// canal de escritura al navegador.
		out.println(textogrande);// aqui te saca el usuario y el texto que escribe.sacas todo el chat por pantalla.
	}

}

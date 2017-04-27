package com.ipartek.ejemplos.estibalizalvarez;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ejemplos.estibalizalvarez.dal.UsuariosDAL;
import com.ipartek.ejemplos.estibalizalvarez.dal.UsuariosDALFijo;
import com.ipartek.ejemplos.estibalizalvarez.tipos.Usuario;

@WebServlet(name = "Saludo", urlPatterns = { "/hola" })
public class HolaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HolaMundo() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);// para que doget llame a dopost
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");// PARA QUE TE CODIFIQUE BIEN LO QUE INTRODUZCAS HASTA CON TILDES.

		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();

		String nombre = request.getParameter("nombre");// para pedir nombre.
		// al ejecutar le pones ?nombre=Estibaliz.
		String pass = request.getParameter("pass");

		Usuario usuario = new Usuario(nombre, pass);// creas un nuevo objeto.
		UsuariosDAL usuariosDal = new UsuariosDALFijo();//

		usuariosDal.alta(new Usuario("Estibaliz", "pepe"));

		if (usuariosDal.validar(usuario))
			out.println("Bienvenido");
		else
			out.println("Usuario no valido");

		// este es otro metodo, utilizado anteriormente:

		// if (nombre == null || nombre.trim().length() == 0)// para cuando no metes ni usuario ni contraseña.
		// out.println("Hola Desconocido");// si no metes ningun usuario o contraseña.
		// else if ("Estibaliz Alvarez".equals(nombre) && "trucios".equals(pass))// esto es el usuario y contraseña.
		// out.println("Bien Hecho. Bienvenido");// te sale cuando metes usuario y contraseña correctos.
		// else
		// out.println("No es correcto el usuario y contraseña.");// te sale el mensaje cuando no coincide conel usuario y contraseña que ya tienes.
		// out.println("Hola" + nombre);
		// out.println(new java.util.Date());

	}
}

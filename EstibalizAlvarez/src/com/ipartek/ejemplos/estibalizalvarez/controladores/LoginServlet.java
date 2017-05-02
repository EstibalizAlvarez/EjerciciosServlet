package com.ipartek.ejemplos.estibalizalvarez.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ejemplos.estibalizalvarez.dal.UsuariosDAL;
import com.ipartek.ejemplos.estibalizalvarez.dal.UsuariosDALFijo;
import com.ipartek.ejemplos.estibalizalvarez.tipos.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Para indicar las rutas de las Páginas:
	public static final String RUTA = "WEB-INF/Vistas/";
	public static final String rutaPrincipal = RUTA + "principal.jsp";
	public static final String rutaLogin = RUTA + "login.jsp";
	public static final String rutaError = RUTA + "error.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);// el metodo doget llama al dopost.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recoger datos de vistas
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");

		// Crear modelos en base a los datos
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPass(pass);

		// Llamada a lógica de negocio
		UsuariosDAL usuarioDAL = new UsuariosDALFijo();

		// Sólo para crear una base de datos falsa con el
		// contenido de un usuario: "Pupi", contraseña: "brutus".
		usuarioDAL.alta(new Usuario("Pupi", "brutus"));

		boolean esValido = usuarioDAL.validar(usuario);

		// Redirigir a una nueva vista.
		if (esValido) {
			request.getSession().setAttribute("usuario", usuario);// esto es para que te recuerde quien eres.
			response.sendRedirect(rutaPrincipal);
		} else {
			usuario.setErrores("El usuario y contraseña indtroduciodos no son válidos");// te sale el mensaje al introducir el usuario y pass incorrectos.
			request.setAttribute("usuario", usuario);//
			request.getRequestDispatcher(rutaLogin).forward(request, response);// que te redireciones a la pagina de login.

			// response.sendRedirect("error.jsp");//que te valla a la pagina error.
			// response.sendRedirect("rutaError.jsp"); esto es lo mismo que el de arriba.
		}
	}
}

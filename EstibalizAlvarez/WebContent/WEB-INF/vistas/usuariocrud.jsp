<%@ include file="includes/cabecera.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Mantenimiento de usuarios</h2>

<table border="1">
	<thead>
		<tr>
			<th>Operaciones</th>
			<th>Usuario</th>
			<th>Contraseña</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${requestScope.usuarios}" var="usuario"> <!-- conjutno de usuarios cada uno que saques uno se llama usuario, la acaba de crear. -->
			<tr>
				<td>
					<a href="?op=modificar&id=${usuario.nombre}">Modificar</a><!--para preguntar el nombre  -->
					<a href="?op=borrar&id=${usuario.nombre}">Borrar</a><!--  -->
				</td>
				<td>${usuario.nombre}</td><!-- le pregunta a usuarios el nombre de usuario -->
				<td>${usuario.pass}</td><!--le pregunta a usuarios el pass de usuario  -->
			</tr>
		</c:forEach>
	</tbody>
</table>

<a href="?op=alta">Alta</a> <!--crear el boton de alta y te va a la pagina de alta.  -->

<%@ include file="includes/pie.jsp"%>

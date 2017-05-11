<!--<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>-->
<%@ include file="includes/cabeceraproductos.jsp"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %><!-- para que te reconozca codigo jsp. -->

<h2>MANTENIMIENTO DE PRODUCTOS</h2> <!-- TITULO -->
<!-- Crear la tabla -->
<table border="1">
	<thead>
		<tr> <!-- Titulos de la parte superior de la tabla.-->
			<th>Accion:</th>
			<th>ID:</th>
			<th>NOMBRE</th>
			<th>DESCRIPCION</th>
			<th>PRECIO</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${requestScope.listaProductos}" var="articulo"> <!--cada producto que saquesde la listaProductos le llama articulo  -->
			 <tr>
				<td>
					
					<a href="?op=modificar&id=${articulo.id}">Modificar</a><!-- enlaces -->
					<a href="?op=borrar&id=${articulo.id}">Borrar</a>
					
					
				</td>
				
				<td>${articulo.id}</td><!-- Extraer el Id. -->
				<td>${articulo.nombre}</td> <!-- extrae el nombre -->
				<td>${articulo.descripcion}</td><!-- extrae la decripcion. -->
				<td>${articulo.precio}</td><!-- extrae el precio -->
			</tr> 
		</c:forEach>
	</tbody>
		
</table>


<%@ include file="includes/pieproductos.jsp"%>
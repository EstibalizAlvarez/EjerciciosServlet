<!--<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>-->
<%@ include file="ListaDeProductos/cabeceraproductos.jsp"%>

<h2>MANTENIMIENTO DE PRODUCTOS</h2> <!-- TITULO -->
<!-- Crear la tabla -->
<table border="1">
	<thead>
		<tr> <!-- Titulos de la parte superior de la tabla.-->
			<th>ID:</th>
			<th>NOMBRE</th>
			<th>DESCRIPCION</th>
			<th>PRECIO</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${requestScope.}" var="articulo"> <!--cada producto que saques le llama articulo  -->
			<!-- <tr>
				<td>
					<a href="?op=modificar&id=${conjunto.nombre}">Modificar</a>
					<a href="?op=borrar&id=${conjunto.nombre}">Borrar</a>
				</td>
				<td>${conjunto.nombre}</td> 
				<td>${conjunto.pass}</td>
			</tr> -->
		</c:forEach>
	</tbody>
	
	
	
	
	
	
</table>










<%@ include file="ListaDeProductos/pieproductos.jsp"%>
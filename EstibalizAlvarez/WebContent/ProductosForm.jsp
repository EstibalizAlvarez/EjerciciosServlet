
<%@ include file="WEB-INF/vistas/includes/cabeceraproductos.jsp"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<h2>FORMULARIO DE PRODUCTOS:</h2>
<jsp:useBean id="Productos1" scope="request" class="com.ipartek.ejercicioproductos.Productos1" /> <!--  -->
<%--vamos a crear el formulario:--%>
	<form action="ProductosForm" method="post">

	<fieldset>
		<label for="id">ID:</label>
			<input id="id" name="id" value"${Productos1.id}"/>
			<br>
		<label for="nombre">Nombre:</label>
			<input id="nombre" name="nombre" value"${Productos1.nombre}"/>
			<br>
		<label for="descripción">Descripción:</label>
			<input id="descripcion" name="descripcion" value"${Productos1.descripcion}"/>
			<br>
			<label for="Precio">Precio:</label>
		<input id="precio" name="precio" value"${Productos1.precio}"/>
	
	</fieldset>
<%--Vamos a crear los botones: --%>
<a href="usuarioform?op=alta">Alta</a>
<a href="usuarioform?op=modificar">Modificar</a>
<a href="usuarioform?op=borrar">Borrar</a>

	
	</form>
	
	
	

<%@ include file="WEB-INF/vistas/includes/pieproductos.jsp"%>

<%@ include file="/WEB-INF/vistas/includes/cabeceraproductos.jsp"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<h2>FORMULARIO DE PRODUCTOS:</h2>
<%--vamos a crear el formulario:--%>
	<form action="ProductosFormServlet" method="post"><!-- llama a la servlet. -->

	<fieldset>
		<label for="id">ID:</label>
			<input id="id" name="id" value="${productos1.id}"/>
			<br>
		<label for="nombre">Nombre:</label>
			<input id="nombre" name="nombre" value="${productos1.nombre}"/>
			<br>
		<label for="descripción">Descripción:</label>
			<input id="descripcion" name="descripcion" value="${productos1.descripcion}"/>
			<br>
			<label for="precio">Precio:</label>
		<input id="precio" name="precio" value="${productos1.precio}"/>
	
	</fieldset>
<%--Vamos a crear los botones: --%>
<fieldset>
	<input type ="submit" value="${param.op}"/><!-- me coge el valor del dato "modificar, borrar,alta" de la lista de productos y lo pone en el boton actual.-->
	<input type="hidden" name="op" value="${param.op}"/>
	
</fieldset>
	
	</form>
	
	
	

<%@ include file="/WEB-INF/vistas/includes/pieproductos.jsp"%>
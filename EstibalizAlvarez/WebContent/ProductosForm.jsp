<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="WEB-INF/vistas/includes/cabeceraproductos.jsp"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<h2>FORMULARIO DE PRODUCTOS:</h2>
<jsp:useBean id="id" scope="request" class="com.ipartek.ejercicioproductos.Productos1" /> <!--  -->

<form action="ProductosForm" method="post">
ID:<input type="text" name="id" value="">
<br>
Nombre:<input type="text" name="nombre" value="">
<br>
Descripción:<input type="text" name="Descripcion" value="">
<br>
Precio:<input type="text" name="Precio" value="">


<%@ include file="WEB-INF/vistas/includes/pieproductos.jsp"%>
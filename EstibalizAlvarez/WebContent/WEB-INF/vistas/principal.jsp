<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%--     pageEncoding="UTF-8"%> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<!-- <title>Principal</title> -->
<!-- </head> -->
<!-- <body> -->
<%@ include file="includes/cabecera.jsp" %>
	<h1>Principal</h1>
	<jsp:useBean id="usuario" scope="sesion" class="com.ipartek.ejemplos.estibalizalvarez.tipos.Usuario"/><!--de la clase usuario te coge el usuario.-->
	<h2>Bienvenido ${usuario.nombre}</h2> <!-- para que te salga el nombre de usuario. -->
<!-- </body> -->
<!-- </html> -->
<%@ include file="includes/pie.jsp" %>
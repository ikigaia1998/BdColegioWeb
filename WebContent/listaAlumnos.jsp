<%@page import="beans.AlumnoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alumnos</title>
</head>
<body>
	<jsp:include page="cabeceraAlumnos.jsp" />
	<br>
	<br>
	<center>
		<h1>Listado de Alumnos</h1>
	</center>
	<table border="2" align="center" width="75%">
		<tr>
			<th>IdAlumno</th>
			<th>ValorCodigo</th>
			<th>Código</th>
			<th>Nombres</th>
			<th>Apellidos</th>
			<th>DNI</th>
			<th>Fecha de nacimiento</th>
			<th>Sexo</th>
			<th>Ciudad</th>
			<th>Dirección</th>
			<th>Fecha Registro</th>
			<th colspan="2">ACCIONES</th>
		</tr>
		<%
			ArrayList<AlumnoDTO> lista = (ArrayList<AlumnoDTO>) request.getAttribute("data");

		if (lista != null) {
			for (AlumnoDTO xPro : lista) {
				out.println("<tr>");
				out.println("<td>" + xPro.getIdAlumno() + "</td>");
				out.println("<td>" + xPro.getValorCodigo() + "</td>");
				out.println("<td>" + xPro.getCodigo() + "</td>");
				out.println("<td>" + xPro.getNombres() + "</td>");
				out.println("<td>" + xPro.getApellidos() + "</td>");
				out.println("<td>" + xPro.getDNI() + "</td>");
				out.println("<td>" + xPro.getFechaNacimiento() + "</td>");
				out.println("<td>" + xPro.getSexo() + "</td>");
				out.println("<td>" + xPro.getCiudad() + "</td>");
				out.println("<td>" + xPro.getDireccion() + "</td>");
				out.println("<td>" + xPro.getFechaRegistro() + "</td>");
				out.println("<td align='center'><a href='ServletAlumno?tipo=buscar&cod=" + xPro.getIdAlumno() + "'>"
				+ "<img src='img/edit.png' title='Editar'></a></td>");
				out.println("<td align='center'><a href='ServletAlumno?tipo=eliminar&cod=" + xPro.getIdAlumno() + "'>"
				+ "<img src='img/delete.png' title='Eliminar'></a></td>");
			}
		}
		%>
	</table>
</body>
</html>
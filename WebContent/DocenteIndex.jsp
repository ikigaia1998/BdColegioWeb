<%@page import="java.util.ArrayList" %>
<%@page import="beans.DocenteDTO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Docentes</title>
</head>
<body>
	<a href="/SColegio/DocenteRegistro.jsp">Registrar</a>
	<table align="center" width="80%">
	<tr>
	<th>Id</th>
	<th>Valor Codigo</th>
	<th>Codigo</th>
	<th>DNI</th>
	<th>Nombres</th>
	<th>Apellidos</th>
	<th>Fecha Nacimiento</th>
	<th>Sexo</th>
	<th>Grado Estudio</th>
	<th>Ciudad</th>
	<th>Direccion</th>
	<th>E-mail</th>
	<th>Telefono</th>
	<th>Fecha Registro</th>
	<th colspan="2">ACCIONES</th>
	</tr>
	<%
		ArrayList<DocenteDTO> lista = (ArrayList<DocenteDTO>) request.getAttribute("data");
		if(lista !=null){
			for(DocenteDTO doc : lista ){
				out.println("<tr>");
				out.println("<td>"+doc.getIdDocente()+"</td>");
				out.println("<td>"+doc.getValorCodigo()+"</td>");
				out.println("<td>"+doc.getCodigo()+"</td>");
				out.println("<td>"+doc.getDNI()+"</td>");
				out.println("<td>"+doc.getNombres()+"</td>");
				out.println("<td>"+doc.getApellidos()+"</td>");
				out.println("<td>"+doc.getFechaNacimiento()+"</td>");
				out.println("<td>"+doc.getSexo()+"</td>");
				out.println("<td>"+doc.getGradoEstudio()+"</td>");
				out.println("<td>"+doc.getCiudad()+"</td>");
				out.println("<td>"+doc.getDireccion()+"</td>");
				out.println("<td>"+doc.getEmail()+"</td>");
				out.println("<td>"+doc.getNumeroTelefono()+"</td>");
				out.println("<td>"+doc.getFechaRegistro()+"</td>");
				//out.println("<td><a href='' class='btn btn-success' style='margin-right:10px ;'><i class='bi bi-pencil-square'></i></a><a href='ServletDocente?tipo=buscar&cod="+ doc.getIdDocente() +"' class='btn btn-danger'><i class='bi bi-trash3'></i></a></td>");
				out.println("<td>"+"<a href='ServletDocente?tipo=buscar&cod="+doc.getIdDocente()+"'>Editar</td>");
				out.println("<td>"+"<a href='ServletDocente?tipo=eliminar&cod="+doc.getIdDocente()+"'>Eliminar</td>");
			}
		}
	
	
	
	%>
	</table>

</body>
</html>


<%@page import="beans.DocenteDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		DocenteDTO obj = (DocenteDTO) request.getAttribute("Docente");
	%>
	<form action="ServletDocente?tipo=actualizar" id="frmactualizar" method="post">
	<input type="hidden" name="txtId" value="${requestScope.Docente.IdDocente}">
	<table align="center">
	<tr>
	<td>Valor Codigo</td>
	<td><input type="text" name="txtValorCod" value="${requestScope.Docente.ValorCodigo}">
	</td>
	</tr>
	<tr>
	<td>Codigo</td>
	<td><input type="text" name="txtCod" value="${requestScope.Docente.Codigo}">
	</td>
	</tr>
	<tr>
	<td>DNI</td>
	<td><input type="text" name="txtDNI" value="${requestScope.Docente.DNI }">
	</td>
	</tr>
	<tr>
	<td>Nombres</td>
	<td><input type="text" name="txtNom" value="${requestScope.Docente.Nombres }">
	</td>
	</tr>
	<tr>
	<td>Apellidos</td>
	<td><input type="text" name="txtApe" value="${requestScope.Docente.Apellidos }">
	</td>
	</tr>
	<tr>
	<td>Sexo</td>
	<td><input type="text" name="txtSexo" value="${requestScope.Docente.Sexo }">
	</td>
	</tr>
	<tr>
	<td>Grado Estudio</td>
	<td><input type="text" name="txtGrEst" value="${requestScope.Docente.GradoEstudio }">
	</td>
	</tr>
	<tr>
	<td>Ciudad</td>
	<td><input type="text" name="txtCiu" value="${requestScope.Docente.Ciudad }">
	</td>
	</tr>
	<tr>
	<td>Direccion</td>
	<td><input type="text" name="txtDir" value="${requestScope.Docente.Direccion }">
	</td>
	</tr>
	<tr>
	<td>Email</td>
	<td><input type="text" name="txtEmail" value="${requestScope.Docente.Email }">
	</td>
	</tr>
	<tr>
	<td>Telefono</td>
	<td><input type="text" name="txtNroTel" value="${requestScope.Docente.NumeroTelefono }">
	</td>
	</tr>
	<tr>
	<td>Fecha Nacimientop</td>
	<td><input type="date" name="txtFechaNac" value="${requestScope.Docente.FechaNacimiento }">
	</td>
	</tr>
	<tr>
	<td colspan="2" align="rigth"><input type="submit" value="Actualizar"></td>
	</tr>
	</table>
	</form>
</body>
</html>
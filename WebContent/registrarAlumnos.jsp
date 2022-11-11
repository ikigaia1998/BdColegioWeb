<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar alumno</title>
</head>
<body>
	<center>
		<h1>Registrar Alumno</h1>
	</center>
	<form action="ServletAlumno?tipo=registrar" id="frmagregar"
		method="post">
		<table align="center">
			<tr>
				<td>Valor código:</td>
				<td><input type="number" name="txt_ValorCod" class="required"></td>
			</tr>
			<tr>
				<td>Código:</td>
				<td><input type="text" name="txt_cod" class="required"></td>
			</tr>
			<tr>
				<td>Nombres:</td>
				<td><input type="text" name="txt_nom" class="required"></td>
			</tr>
			<tr>
				<td>Apellidos:</td>
				<td><input type="text" name="txt_ape" class="required"></td>
			</tr>
			<tr>
				<td>Documento de identidad:</td>
				<td><input type="number" name="txt_dni" class="required"></td>
			</tr>
			<tr>
				<td>Fecha de nacimiento:</td>
				<td><input type="text" name="txt_fecnac" class="required"></td>
			</tr>
			<tr>
				<td>Sexo:</td>
				<td><input type="text" name="txt_sexo" class="required"></td>
			</tr>
			<tr>
				<td>Ciudad:</td>
				<td><input type="text" name="txt_ciud" class="required"></td>
			</tr>
			<tr>
				<td>Dirección:</td>
				<td><input type="text" name="txt_direc" class="required"></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit"
					value="Registrar"></td>
			</tr>
		</table>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Docente registro</title>
</head>
<body>
<form action="ServletDocente?tipo=registrar" id="frmagregar" method="post">
<table align="center">
<tr>
<td>Valor Codigo: </td>
<td><input type="text" name="txtValorCod" class="required"></td>
</tr>
<tr>
<td>Codigo: </td>
<td><input type="text" name="txtCod" class="required"></td>
</tr>
<tr>
<td>DNI: </td>
<td><input type="text" name="txtDNI" class="required"></td>
</tr>
<tr>
<td>Nombres: </td>
<td><input type="text" name="txtNom" class="required"></td>
</tr>
<tr>
<td>Apellidos: </td>
<td><input type="text" name="txtApe" class="required"></td>
</tr>
<tr>
<td>Sexo: </td>
<td><input type="text" name="txtSexo" class="required"></td>
</tr>
<tr>
<td>Grado Estudio: </td>
<td><input type="text" name="txtGrEst" class="required"></td>
</tr>
<tr>
<td>Ciudad: </td>
<td><input type="text" name="txtCiu" class="required"></td>
</tr>
<tr>
<td>Direccion: </td>
<td><input type="text" name="txtDir" class="required"></td>
</tr>
<tr>
<td>Email: </td>
<td><input type="text" name="txtEmail" class="required"></td>
</tr>
<tr>
<td>Telefono: </td>
<td><input type="text" name="txtNroTel" class="required"></td>
</tr>
<tr>
<td>Fecha Nacimiento: </td>
<td><input type="date" name="txtFecNac" class="required"></td>
</tr>
<tr>
<td colspan="2" align="rigth"><input type="submit" value="Registrar"></td>
</tr>

</table>
</form> 

</body>
</html>
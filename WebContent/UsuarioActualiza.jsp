<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="beans.UsuarioDTO"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
<title>Document</title>
</head>
<body>
	<%
		UsuarioDTO obj = (UsuarioDTO) request.getAttribute("Usuario");
	%>
	<h2>Actualizar Usuario</h2>
	<div class="container">
		<form action="ServletUsuario?tipo=actualizar" method="post">
			<fieldset class="mb-3" disabled>
				<label for="txt_codigo">Codigo : </label> <input name="txt_codigo"
					type="text" class="form-control" readonly
					value="${requestScope.Usuario.IdUsuario}">
			</fieldset>
			<div class="mb-3">
				<label for="txt_nombre">Nombres : </label> <input name="txt_nombre"
					type="text" class="form-control"
					value="${requestScope.Usuario.Nombres}">
			</div>f
			<div class="mb-3">
				<label for="txt_apellido">Apellidos : </label> <input
					name="txt_apellido" type="text" class="form-control"
					value="${requestScope.Usuario.Apellidos}">
			</div>
			<div class="mb-3">
				<label for="txt_Login">Usuario : </label> <input name="txt_Login"
					type="text" class="form-control"
					value="${requestScope.Usuario.LoginUsuario}">
			</div>
			<div class="mb-3">
				<label for="txt_clave">Contraseña : </label> <input name="txt_clave"
					type="text" class="form-control"
					value="${requestScope.Usuario.Clave}">
			</div>
			<button class="btn btn-primary">Registrar</button>
	</div>
	</form>
	</div>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</html>
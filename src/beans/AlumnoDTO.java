package beans;

import java.sql.Date;

public class AlumnoDTO {

	int IdAlumno;
	int ValorCodigo;
	String codigo;
	String Nombres;
	String Apellidos;
	String DNI;
	Date FechaNacimiento;
	String TextoFechaNacimiento;
	String sexo;
	String Ciudad;
	String Direccion;
	Date FechaRegistro;

	public int getIdAlumno() {
		return IdAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		IdAlumno = idAlumno;
	}

	public int getValorCodigo() {
		return ValorCodigo;
	}

	public void setValorCodigo(int valorCodigo) {
		ValorCodigo = valorCodigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getTextoFechaNacimiento() {
		return TextoFechaNacimiento;
	}

	public void setTextoFechaNacimiento(String textoFechaNacimiento) {
		TextoFechaNacimiento = textoFechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}

}

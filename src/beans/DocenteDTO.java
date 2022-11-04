package beans;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class DocenteDTO {

	@Getter
	@Setter
	
    int IdDocente;
    int ValorCodigo;
    String Codigo;
    String DNI;
    String Nombres;
    String Apellidos;
    Date FechaNacimiento;
    String TextoFechaNacimiento;
    String Sexo;
    String GradoEstudio;
    String Ciudad;
    String Direccion;
    String Email;
    String NumeroTelefono;
     boolean Activo;
     Date FechaRegistro;
     List<NivelDTO> oListaNivel;
	public int getIdDocente() {
		return IdDocente;
	}
	public void setIdDocente(int idDocente) {
		IdDocente = idDocente;
	}
	public int getValorCodigo() {
		return ValorCodigo;
	}
	public void setValorCodigo(int valorCodigo) {
		ValorCodigo = valorCodigo;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
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
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getGradoEstudio() {
		return GradoEstudio;
	}
	public void setGradoEstudio(String gradoEstudio) {
		GradoEstudio = gradoEstudio;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNumeroTelefono() {
		return NumeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		NumeroTelefono = numeroTelefono;
	}
	public boolean isActivo() {
		return Activo;
	}
	public void setActivo(boolean activo) {
		Activo = activo;
	}
	public Date getFechaRegistro() {
		return FechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}
	public List<NivelDTO> getoListaNivel() {
		return oListaNivel;
	}
	public void setoListaNivel(List<NivelDTO> oListaNivel) {
		this.oListaNivel = oListaNivel;
	}
}

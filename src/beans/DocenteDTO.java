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
}

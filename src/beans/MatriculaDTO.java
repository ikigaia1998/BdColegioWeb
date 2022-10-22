package beans;

import lombok.Getter;
import lombok.Setter;

public class MatriculaDTO {
	
		@Getter
		@Setter
		int IdMatricula;
		AlumnoDTO oAlumno;
		NivelDetalleDTO oNivelDetalle;
	
	
}

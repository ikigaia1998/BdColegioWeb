package beans;

import lombok.Getter;
import lombok.Setter;

public class CalificacionDTO {
		
@Getter
@Setter

	int idCalificacion;
	CurriculaDTO oCurricula;
	AlumnoDTO oAlumno;
	double Nota;
	
	
}

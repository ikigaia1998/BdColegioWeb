package beans;

import lombok.Getter;
import lombok.Setter;

public class CurriculaDTO {
	
	@Getter
	@Setter
	
	int IdCurricula;
	int IdDocenteNivelDetalleCurso;
	String Descripcion;
	DocenteCursoDTO oDocenteCurso;
}

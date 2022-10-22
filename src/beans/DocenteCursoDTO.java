package beans;

import lombok.Getter;
import lombok.Setter;

public class DocenteCursoDTO {

		@Getter
		@Setter
		int IdDocenteCurso;
		NivelDetalleCursoDTO oNivelDetalleCurso;
		DocenteDTO oDocente;
		boolean Activo;
	
}

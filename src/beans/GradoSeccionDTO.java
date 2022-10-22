package beans;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class GradoSeccionDTO {

@Getter
@Setter

	int IdGradoSeccion;
	String DescripcionGrado;
	String DescipcionSeccion;
	boolean Activo;
	boolean Asignado;
	List<CursoDTO> oListaCurso;
}

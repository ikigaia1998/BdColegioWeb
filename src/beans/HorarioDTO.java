package beans;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

public class HorarioDTO {

	
	@Getter
	@Setter
	int IdHorario;
	NivelDetalleCursoDTO oNivelDetalleCurso;
	String DiaSemana;
	Date HoraInicio;
	Date HoraFin;
	String TextoHoraInicio;
	String TextoHoraFin;
	boolean Activo;
}

package beans;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class NivelDTO {
	@Getter
	@Setter
	
	int IdNivel;
	PeriodoDTO oPeriodo;
	String DescripcionNivel;
	String DescripcionTurno;
	Date HoraInicio;
	Date HoraFin;
	String TextoHoraInicio;
	String TextoHoraFin;
	boolean Activo;
	List<GradoSeccionDTO>oListaGradoSeccion;
}

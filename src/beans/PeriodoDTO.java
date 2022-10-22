package beans;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

public class PeriodoDTO {

@Getter
@Setter

	int IdPeriodo;
	String Descripcion;
	Date FechaInicio;
	Date FechaFin;
	String textoFechaInicio;
	String textoFechaFin;
	boolean Activo;

}

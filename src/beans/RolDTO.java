package beans;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

public class RolDTO {
	
	@Getter
	@Setter
	int IdRol;
	String Descripcion;
	boolean Activo;
	Date FechaRegistro;
	
}

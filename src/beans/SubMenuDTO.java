package beans;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

public class SubMenuDTO {
	@Getter
	@Setter
	
	int IdSubMenu;
	int IdMenu;
	String Nombre;
	String NombreFormulario;
	String Accion;
	boolean Activo;
	Date FechaRegistro;
	
}

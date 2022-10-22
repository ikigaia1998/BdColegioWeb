package beans;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class MenuDTO {

	
		@Getter
		@Setter
		int IdMenu;
		String Nombre;
		String Icono;
		List<SubMenuDTO> oSubMenu;
		boolean Activo;
		Date FechaRegistro;
	
}

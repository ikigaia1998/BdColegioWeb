package beans;

import lombok.Getter;
import lombok.Setter;

public class PermisosDTO {

	@Getter
	@Setter
	
	int IdPermisos;
	String Menu;
	String SubMenu;
	boolean Activo;
}

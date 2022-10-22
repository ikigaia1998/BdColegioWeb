package beans;

import lombok.Getter;
import lombok.Setter;

public class NivelDetalleDTO {
	@Getter
	@Setter
	
	int IdNivelDetalle;
	NivelDTO oNivel;
	GradoSeccionDTO oGRadoSEccion;
	int totalVAcantes ;
	int VacantesDisponibles;
	int VacantesOcupadas;
	boolean Activo;
	
}

package interfaces;

import java.util.List;

import beans.DocenteDTO;
import beans.UsuarioDTO;

public interface DocenteDAO {
	public List<DocenteDTO>listarDocente();
	public int registrarDocente(DocenteDTO obj);
	public int actualizarDocente(DocenteDTO obj);
	public int eliminarDocente(int cod);
	public DocenteDTO buscarDocente(int cod);
}

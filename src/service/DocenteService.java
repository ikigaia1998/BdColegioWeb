package service;

import java.util.List;

import Factory.DAOFactory;
import beans.DocenteDTO;
import interfaces.DocenteDAO;
import util.Constantes;

public class DocenteService {
	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DE_DATOS_MYSQL);
	DocenteDAO objDoc = fabrica.getDocente();
	
	public List<DocenteDTO> listaDocente(){
		return objDoc.listarDocente();
	}
	public DocenteDTO buscarDocente(int cod) {
		return objDoc.buscarDocente(cod);
	}
	public int registrarDocente(DocenteDTO obj) {
		return objDoc.registrarDocente(obj);
	}
	public int actualizarDocente(DocenteDTO obj) {
		return objDoc.actualizarDocente(obj);
	}
	public int eliminarDocente(int cod) {
		return objDoc.eliminarDocente(cod);
	}
	
}

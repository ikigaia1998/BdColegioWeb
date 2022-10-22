package dao;

import java.util.List;

import beans.AlumnoDTO;
import interfaces.AlumnoDAO;

public class MySqlAlumnoDAO implements AlumnoDAO {

	@Override
	public List<AlumnoDTO> listarAlumno() {
		return null;
	}

	@Override
	public int registrarAlumno(AlumnoDTO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizarAlumno(AlumnoDTO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarAlumno(int cod) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AlumnoDTO buscarAlumno(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

}

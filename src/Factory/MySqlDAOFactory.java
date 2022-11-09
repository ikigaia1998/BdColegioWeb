package Factory;

import dao.MySqlAlumnoDAO;
import dao.MySqlDocenteDAO;
import dao.MySqlUsuarioDAO;
import interfaces.AlumnoDAO;
import interfaces.DocenteDAO;
import interfaces.UsuarioDao;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public AlumnoDAO getAlumno() {
		// TODO Auto-generated method stub
		return new MySqlAlumnoDAO();
	}

	@Override
	public UsuarioDao getUsuario() {
		// TODO Auto-generated method stub
		return new MySqlUsuarioDAO();
	}

	@Override
	public DocenteDAO getDocente() {
		// TODO Auto-generated method stub
		return new MySqlDocenteDAO();
	}

	
}

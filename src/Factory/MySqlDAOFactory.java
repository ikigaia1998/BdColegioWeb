package Factory;

import dao.MySqlAlumnoDAO;
import dao.MySqlUsuarioDAO;
import interfaces.AlumnoDAO;
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


}

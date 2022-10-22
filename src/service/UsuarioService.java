package service;

import Factory.DAOFactory;
import beans.UsuarioDTO;
import interfaces.UsuarioDao;


public class UsuarioService {
		DAOFactory fabrica = DAOFactory.getDAOFactory(util.Constantes.ORIGEN_DE_DATOS_MYSQL);
		UsuarioDao objUsu=fabrica.getUsuario();

		public UsuarioDTO iniciarSesion(String log,String pass) {
			return objUsu.iniciarSesion(log, pass);
		}

}

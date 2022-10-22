package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import beans.UsuarioDTO;
import interfaces.UsuarioDao;
import lombok.extern.apachecommons.CommonsLog;



import util.MySqlDBConexion;

@CommonsLog
public class MySqlUsuarioDAO implements UsuarioDao {

	@Override
	public List<UsuarioDTO> listarUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int registrarUsuario(UsuarioDTO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizarUsuario(UsuarioDTO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarUsuario(int cod) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UsuarioDTO buscarUsuario(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public UsuarioDTO iniciarSesion(String log, String pass) {
		UsuarioDTO obj= null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs= null;
		try {
			String sql = "Select*from usuario where LoginUsuario=? and LoginClave=?";
			cn = MySqlDBConexion.getConexion();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1,log);
			pstm.setString(2,pass);
			rs = pstm.executeQuery();
			if(rs.next()) {
				obj = new UsuarioDTO();
				obj.setIdUsuario(rs.getInt(1));
				obj.setNombres(rs.getString(2));
				obj.setApellidos(rs.getString(3));
				obj.setLoginUsuario(rs.getString(4));
				obj.setClave(rs.getString(5));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs!=null) rs.close();
				if(pstm!=null) pstm.close();
				if(cn!=null)cn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return obj;
	}
}

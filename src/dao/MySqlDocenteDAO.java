package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.DocenteDTO;
import beans.UsuarioDTO;
import interfaces.DocenteDAO;
import util.MySqlDBConexion;

public class MySqlDocenteDAO implements DocenteDAO{

	@Override
	public List<DocenteDTO> listarDocente() {
		List<DocenteDTO> data = new ArrayList<DocenteDTO>();
		DocenteDTO obj = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MySqlDBConexion.getConexion();
			String sql = "select * from docente";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				obj = new DocenteDTO();
				obj.setIdDocente(rs.getInt(1));;
				obj.setValorCodigo(rs.getInt(2));
				obj.setCodigo(rs.getString(3));
				obj.setDNI(rs.getString(4));
				obj.setNombres(rs.getString(5));
				obj.setApellidos(rs.getString(6));
				obj.setFechaNacimiento(rs.getDate(7));
				obj.setSexo(rs.getString(8));
				obj.setGradoEstudio(rs.getString(9));
				obj.setCiudad(rs.getString(10));
				obj.setDireccion(rs.getString(11));
				obj.setEmail(rs.getString(12));
				obj.setNumeroTelefono(rs.getString(13));
				obj.setFechaRegistro(rs.getDate(14));
				data.add(obj);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	
	}

	@Override
	public int registrarDocente(DocenteDTO obj) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm =null;

		try {
			cn=MySqlDBConexion.getConexion();
			String sql = "insert into docente values(null,?,?,?,?,?,?,?,?,?,?,?,?,null)";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, obj.getValorCodigo());
			pstm.setString(2, obj.getCodigo());
			pstm.setString(3, obj.getDNI());
			pstm.setString(4, obj.getNombres());
			pstm.setString(5, obj.getApellidos());
			pstm.setDate(6, obj.getFechaNacimiento());
			pstm.setString(7, obj.getSexo());
			pstm.setString(8, obj.getGradoEstudio());
			pstm.setString(9, obj.getCiudad());
			pstm.setString(10, obj.getDireccion());
			pstm.setString(11, obj.getEmail());
			pstm.setString(12, obj.getNumeroTelefono());

			estado = pstm.executeUpdate();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return estado;
	}

	@Override
	public int actualizarDocente(DocenteDTO obj) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm =null;

		try {
			/*
			 * create table DOCENTE(
IdDocente int primary key auto_increment,
ValorCodigo int,
Codigo varchar(50),
DocumentoIdentidad varchar(100),
Nombres varchar(100),
Apellidos varchar(100),
FechaNacimiento date,
Sexo varchar(50),
GradoEstudio varchar(100),
Ciudad varchar(100),
Direccion varchar(100),
Email varchar(50),
NumeroTelefono varchar(50),
FechaRegistro datetime default null
);
			 * */
			cn=MySqlDBConexion.getConexion();
			String sql = "update docente set ValorCodigo=?,Codigo=?"
					+ ",DocumentoIdentidad=?,Nombres=?,Apellidos=?"
					+ ",FechaNacimiento=?,Sexo=?,GradoEstudio=?,Ciudad=?,Direccion=?,"
					+ "Email=?,NumeroTelefono=? where IdDocente=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, obj.getValorCodigo());
			pstm.setString(2, obj.getCodigo());
			pstm.setString(3, obj.getDNI());
			pstm.setString(4, obj.getNombres());
			pstm.setString(5, obj.getApellidos());
			pstm.setDate(6, obj.getFechaNacimiento());
			pstm.setString(7, obj.getSexo());
			pstm.setString(8, obj.getGradoEstudio());
			pstm.setString(9, obj.getCiudad());
			pstm.setString(10, obj.getDireccion());
			pstm.setString(11, obj.getEmail());
			pstm.setString(12, obj.getNumeroTelefono());
			pstm.setInt(13, obj.getIdDocente());

			estado = pstm.executeUpdate();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return estado;
	}

	@Override
	public int eliminarDocente(int cod) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm =null;
		try {
			cn=MySqlDBConexion.getConexion();
			String sql = "delete from docente where IdDocente=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			estado = pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return estado;
	}

	@Override
	public DocenteDTO buscarDocente(int cod) {
		// TODO Auto-generated method stub
		DocenteDTO obj=null;
		Connection cn = null;
		PreparedStatement pstm =null;
		ResultSet rs = null;
		try {
			cn=MySqlDBConexion.getConexion();
			String sql = "Select * from docente where IdDocente=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			rs = pstm.executeQuery();
			while(rs.next()) {
				obj = new DocenteDTO();
				obj.setIdDocente(rs.getInt(1));
				obj.setValorCodigo(rs.getInt(2));
				obj.setCodigo(rs.getString(3));
				obj.setDNI(rs.getString(4));
				obj.setNombres(rs.getString(5));
				obj.setApellidos(rs.getString(6));
				obj.setFechaNacimiento(rs.getDate(7));
				obj.setSexo(rs.getString(8));
				obj.setGradoEstudio(rs.getString(9));
				obj.setCiudad(rs.getString(10));
				obj.setDireccion(rs.getString(11));
				obj.setEmail(rs.getString(12));
				obj.setNumeroTelefono(rs.getString(13));
				obj.setFechaRegistro(rs.getDate(14));
				
				
				
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}

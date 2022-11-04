package MisServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.AlumnoDTO;
import service.AlumnoService;
import util.Conversiones;

/**
 * Servlet implementation class ServletAlumno
 */
@WebServlet("/ServletAlumno")
public class ServletAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AlumnoService serviAlumno = new AlumnoService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String xtipo = request.getParameter("tipo");
		if (xtipo.equals("listar")) {
			listar(request, response);
		}else if (xtipo.equals("registrar"))
			registrar(request, response);
		else if (xtipo.equals("buscar"))
			buscar(request, response);
		else if (xtipo.equals("actualizar"))
			actualizar(request, response);
		else if (xtipo.equals("eliminar"))
			eliminar(request, response);
	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cod = Integer.parseInt(request.getParameter("cod"));
		serviAlumno.eliminaAlumno(cod);
		listar(request, response);
	}

	private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int valorCodigo, id;
		id = Integer.parseInt(request.getParameter("txt_id"));
		String cod = request.getParameter("txt_cod");
		String nom = request.getParameter("txt_nom");
		String ape = request.getParameter("txt_ape");
		String dni = request.getParameter("txt_dni");
		String fechanac = request.getParameter("txt_fecnac");
		String sexo = request.getParameter("txt_sexo");
		String ciud = request.getParameter("txt_ciud");
		String direc = request.getParameter("txt_direc");
		valorCodigo = Integer.parseInt(request.getParameter("txt_ValorCod"));
		AlumnoDTO obj = new AlumnoDTO();
		obj.setIdAlumno(id);
		obj.setValorCodigo(valorCodigo);
		obj.setCodigo(cod);
		obj.setNombres(nom);
		obj.setApellidos(ape);
		obj.setDNI(dni);
		obj.setFechaNacimiento(Conversiones.toFecha(fechanac));
		obj.setSexo(sexo);
		obj.setCiudad(ciud);
		obj.setDireccion(direc);
		serviAlumno.actualizaAlumno(obj);
		listar(request, response);
	}

	private void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("Alumno", serviAlumno.buscaAlumno(id));
		request.getRequestDispatcher("actualizarAlumno.jsp").forward(request, response);
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int valorCodigo;
		String cod = request.getParameter("txt_cod");
		String nom = request.getParameter("txt_nom");
		String ape = request.getParameter("txt_ape");
		String dni = request.getParameter("txt_dni");
		String fechanac = request.getParameter("txt_fecnac");
		String sexo = request.getParameter("txt_sexo");
		String ciud = request.getParameter("txt_ciud");
		String direc = request.getParameter("txt_direc");
		valorCodigo = Integer.parseInt(request.getParameter("txt_ValorCod"));
		AlumnoDTO obj = new AlumnoDTO();
		obj.setValorCodigo(valorCodigo);
		obj.setCodigo(cod);
		obj.setNombres(nom);
		obj.setApellidos(ape);
		obj.setDNI(dni);
		obj.setFechaNacimiento(Conversiones.toFecha(fechanac));
		obj.setSexo(sexo);
		obj.setCiudad(ciud);
		obj.setDireccion(direc);
		serviAlumno.registraAlumno(obj);
		listar(request, response);
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("data", serviAlumno.listaAlumno());
		request.getRequestDispatcher("listaAlumnos.jsp").forward(request, response);
	}

}

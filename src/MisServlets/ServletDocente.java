package MisServlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.DocenteDTO;
import service.DocenteService;

/**
 * Servlet implementation class ServletDocente
 */
@WebServlet("/ServletDocente")
public class ServletDocente extends HttpServlet {
	private static final long serialVersionUID = 1L;
    DocenteService serviDoc = new DocenteService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDocente() {
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
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String xtipo = request.getParameter("tipo");
		if(xtipo.equals("listar")) {
			listar(request,response);
		}else if(xtipo.equals("buscar")) {
			buscar(request,response);
		}else if(xtipo.equals("registrar")) {
			registrar(request,response);
		}else if(xtipo.equals("actualizar")) {
			actualizar(request,response);
		}else if(xtipo.equals("eliminar")) {
			eliminar(request,response);
		}
	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int id = Integer.parseInt(request.getParameter("cod"));
		serviDoc.eliminarDocente(id);
		listar(request,response);
	}

	private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int valorCod,IdDocente;
		IdDocente = Integer.parseInt(request.getParameter("txtId"));
		String cod,DNI,nombres,apellidos,sexo,gradoEstudio,ciudad,direccion,email,nroTel;
		Date fecNac;
		valorCod = Integer.parseInt(request.getParameter("txtValorCod"));
		cod = request.getParameter("txtCod");
		DNI = request.getParameter("txtDNI");
		nombres = request.getParameter("txtNom");
		apellidos = request.getParameter("txtApe");
		sexo = request.getParameter("txtSexo");
		gradoEstudio = request.getParameter("txtGrEst");
		ciudad = request.getParameter("txtCiu");
		direccion = request.getParameter("txtDir");
		email = request.getParameter("txtEmail");
		nroTel = request.getParameter("txtNroTel");
		fecNac = Date.valueOf(request.getParameter("txtFecNac"));
		
		DocenteDTO obj = new DocenteDTO();
		obj.setIdDocente(IdDocente);
		obj.setValorCodigo(valorCod);
		obj.setCodigo(cod);
		obj.setDNI(DNI);
		obj.setNombres(nombres);
		obj.setApellidos(apellidos);
		obj.setSexo(sexo);
		obj.setGradoEstudio(gradoEstudio);
		obj.setCiudad(ciudad);
		obj.setDireccion(direccion);
		obj.setEmail(email);
		obj.setNumeroTelefono(nroTel);
		obj.setFechaNacimiento(fecNac);
		
		serviDoc.actualizarDocente(obj);
		listar(request,response);
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int valorCod;
		String cod,DNI,nombres,apellidos,sexo,gradoEstudio,ciudad,direccion,email,nroTel;
		Date fecNac;
		valorCod = Integer.parseInt(request.getParameter("txtValorCod"));
		cod = request.getParameter("txtCod");
		DNI = request.getParameter("txtDNI");
		nombres = request.getParameter("txtNom");
		apellidos = request.getParameter("txtApe");
		sexo = request.getParameter("txtSexo");
		gradoEstudio = request.getParameter("txtGrEst");
		ciudad = request.getParameter("txtCiu");
		direccion =request.getParameter("txtDir");
		email = request.getParameter("txtEmail");
		nroTel = request.getParameter("txtNroTel");
		fecNac = Date.valueOf(request.getParameter("txtFecNac"));
		
		DocenteDTO obj = new DocenteDTO();
		obj.setValorCodigo(valorCod);
		obj.setCodigo(cod);
		obj.setDNI(DNI);
		obj.setNombres(nombres);
		obj.setApellidos(apellidos);
		obj.setSexo(sexo);
		obj.setGradoEstudio(gradoEstudio);
		obj.setCiudad(ciudad);
		obj.setDireccion(direccion);
		obj.setEmail(email);
		obj.setNumeroTelefono(nroTel);
		obj.setFechaNacimiento(fecNac);
		
		serviDoc.registrarDocente(obj);
		listar(request,response);
	}

	private void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("cod"));
		request.setAttribute("Docente", serviDoc.buscarDocente(id));
		request.getRequestDispatcher("DocenteActualiza.jsp").forward(request, response);
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		
		request.setAttribute("data",serviDoc.listaDocente());
		request.getRequestDispatcher("DocenteIndex.jsp").forward(request, response);
	}

}

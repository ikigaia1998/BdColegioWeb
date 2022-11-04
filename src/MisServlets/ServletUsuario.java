package MisServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UsuarioDTO;
import service.UsuarioService;

@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	UsuarioService uservice = new UsuarioService();
	private static final long serialVersionUID = 1L;

    public ServletUsuario() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String xtipo= request.getParameter("tipo"); 
		if(xtipo.equals("iniciarSesion")) iniciarSesion(request,response);
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void iniciarSesion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String log,pass;
		log= request.getParameter("txtlogin");
		pass=request.getParameter("txtpass");
		UsuarioDTO e = uservice.iniciarSesion(log, pass);
		if(e==null) {
			request.setAttribute("msj","<div class ='alert alert-warning' role ='alert'>" + 
					"            <h4>Error usuario y/o clave</h4></div>");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else response.sendRedirect("menu.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

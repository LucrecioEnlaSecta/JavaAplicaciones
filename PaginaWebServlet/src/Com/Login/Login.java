package Com.Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Com.DataBase.AccountDAO;
import Com.Models.AccountVO;
@WebServlet("/Login")
public class Login extends HttpServlet {
	
    public Login() {
 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Llego la request al metodo doPost");
		 String Nombre = request.getParameter("nombre");
		 String Apellido = request.getParameter("apellido");
		 int Edad = Integer.parseInt(request.getParameter("edad"));
		 String Username = request.getParameter("username");
		 String Password = request.getParameter("password");
		 String Email = request.getParameter("email");
		 System.out.println("Ha llegado al metodo doPost los datos del usuario: "+Username);
		 if( !(Nombre.isEmpty()& Apellido.isEmpty() & Username.isEmpty() & Password.isEmpty() & Email.isEmpty() ) ) {
			 AccountDAO dao = new AccountDAO();
			 AccountVO user = new AccountVO();
			 user.setNombre(Nombre);
			 user.setApellido(Apellido);
			 user.setEdad(Edad);
			 user.setUsername(Username);
			 user.setPassword(Password);
			 user.setEmail(Email);
			 dao.registrarUsuario(user);
			 response.sendRedirect("MyFirstProgram.html");
		 }else {
			 System.out.println("No se ha podido registrar al usuario");
			 response.sendRedirect("ProyectoWeb/WebContent/Error.html");
		 }
		
		
	}

}

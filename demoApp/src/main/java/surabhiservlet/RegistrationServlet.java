package surabhiservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RrgistrationServlet
 */
@WebServlet("/registration.do")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("Email");
		String password = request.getParameter("pwd");
		String gender= request.getParameter("Gen");
		String slot=request.getParameter("Check");
		System.out.println("welcome "+email);
		System.out.println("your password is "+password);
		System.out.println("have you booked slot "+slot);
		System.out.println("your gender is "+gender);
		response.setContentType("text/html");
	    PrintWriter write = response.getWriter();
        write.print(email + " your registration is successfull.Please login!!");
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
		//rd.forward(request, response);
		rd.include(request, response);
	}

}

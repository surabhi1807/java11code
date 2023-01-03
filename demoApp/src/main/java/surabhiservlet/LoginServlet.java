package surabhiservlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("Email");
		String password = request.getParameter("pwd");
		System.out.println("Welcome "+email );
		System.out.println("your password "+ password);
		RequestDispatcher rd=null;
		if("pragati@123".equals(password)) {
		//	rd = request.getRequestDispatcher("success.html");
			// rd = request.getRequestDispatcher("mysearchengine.html");
			
		//	String, Wrapper classes , Date
			request.setAttribute("uname",email);
			LocalDate date = LocalDate.now();
			String currentDate = date.toString();
			request.setAttribute("date", currentDate);
			request.setAttribute("id", 180711);
			
			//Collection of String , Wrapper , Date
			List<String> myCourse = new ArrayList<>();
			myCourse.add("dbms");
			myCourse.add("data science");
			myCourse.add("big data");
			myCourse.add("java");
			request.setAttribute("listOfCourse",myCourse);

			//Collection of collections
			List<List<String>>myFavList=new ArrayList<>();
		
		    List<String> sweets = new ArrayList<>();
		    sweets.add("gulabjamun");
		    sweets.add("barfi");
		    sweets.add("laddu");
		    sweets.add("rasgula");
		    myFavList.add(sweets);
		    
		    List<String>flowers = new ArrayList<>();
		    flowers.add("Rose");
		    flowers.add("lotus");
		    flowers.add("sunflower");
		    myFavList.add(flowers);
		    
		    List<String>makeup = new ArrayList<>();
		    makeup.add("lipstick");
		    makeup.add("eyeliner");
		    makeup.add("kajal");
		    myFavList.add(makeup);
		    request.setAttribute("listOfList",myFavList);
			rd = request.getRequestDispatcher("showdata.jsp");
		}else {
			 rd= request.getRequestDispatcher("fail.html");
		}
	rd.forward(request, response);
	//rd.forward(request, response);
	//System.out.println("statement after forward method");
		
	}

}

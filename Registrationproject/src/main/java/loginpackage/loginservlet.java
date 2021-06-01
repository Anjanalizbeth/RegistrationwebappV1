package loginpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/login")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();  
		String uname = request.getParameter("Uname");
		String password = request.getParameter("password");
		loginmember  Loginmember= new loginmember();
		Loginmember.setUname(uname);
		Loginmember.setPassword(password);
		
		LoginDao loginDao = new LoginDao();
		
		
		if (loginDao.validate(Loginmember))
		{
			response.sendRedirect("loginsuccess.jsp");
			
		}
		else 
		{
			//HttpSession session = request.getSession();
			//response.sendRedirect("login.jsp?msg=Invalid user id and password");
			//System.err.println("Username or Password you enterd is incorrect.");			
			out.print("Sorry username or password error");  
			response.sendRedirect("invalidLogin.jsp");			
			
		}
		
	}


}

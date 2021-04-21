

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
/**
 * Servlet implementation class Userinfo1
 */
@WebServlet("/Userinfo1")
public class Userinfo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Userinfo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			response.setContentType("text/html");
			PrintWriter p=response.getWriter();
			String name=request.getParameter("Name");
			String course=request.getParameter("Course");
			p.println("<html>");
			p.print("<br>");
			p.println("<h2>"+"Welcome "+name+"</h2>");
			p.print("<br>");
			p.println("<h2>"+"Your course is "+course+"</h2>");
			
			Cookie a = new Cookie("Name", name);

			Cookie b =new Cookie("Course", course); 
			response.addCookie(a);
			response.addCookie(b);

			p.println("<a href='serv2'>Click Me</a>"); p.close();
			p.print("</html>");
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

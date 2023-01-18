package you;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response, ServletRequest Session) throws ServletException, IOException {
		
    		response.setContentType("text/html");
   			PrintWriter out=response.getWriter();
   			String name=request.getParameter("user");
   			String pass=request.getParameter("pwd");
   			Cookie[]ck=request.getCookies();
   			out.println("From Servlet2:"+ck[0].getValue());
   			HttpSession session=request.getSession();
   			String user=(String)Session.getAttribute("info");
   			out.println("From Servlet2:"+user);
   			
	}

}

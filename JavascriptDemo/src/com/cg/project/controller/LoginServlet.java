package com.cg.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Associate;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int associateId=Integer.parseInt(request.getParameter("username"));
		String password=request.getParameter("password");
		
		/*PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<div>");
		if(username.equals("harry") && password.equals("saini")) 
			out.println("<h2><font color='green'>Welcome to page</h2>"+username);
		
		else 
			out.println("<h2><font color='red'>oops something is not right</h2>");
		
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
*/
		//dispatcher programming
		
		Associate associate=new Associate(associateId,password);
		
		RequestDispatcher dispatcher=null;
		
		if(associate.getAssociateId()==1111 && associate.getPassword().equals("saini")) {
			dispatcher=request.getRequestDispatcher("successPage.jsp");
		request.setAttribute("associate", associate);
		dispatcher.forward(request, response);
		}
		else {
			dispatcher=request.getRequestDispatcher("errorPage.jsp");
			dispatcher.forward(request, response);
			
		}
	}

}

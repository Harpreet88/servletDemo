package com.cg.project.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Associate;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int associateId=Integer.parseInt(request.getParameter("username"));
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String telephone=request.getParameter("telephone");
		List <String> communication=Arrays.asList(request.getParameter("communication"));
		
//		PrintWriter out=response.getWriter();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<div>");
//		if(name.equals("harry") && password.equals("saini") && telephone.equals("987654321") && email.equals("a.@email.com")) 
//			out.println("<h2><font color='green'>Welcome to page</h2>"+name+"<br>"+ password +"<br>"+ telephone+"<br>"+ email);
//		
//		else 
//			out.println("<h2><font color='red'>oops something is not right</h2>");
//		
//		out.println("</div>");
//		out.println("</body>");
//		out.println("</html>");
//		out.println(name);
//		out.println(email);
//		out.println(password);
//		out.println(telephone);
		
Associate associate=new Associate(associateId,password,email,telephone,communication);
		
		RequestDispatcher dispatcher=null;
		
		if(associate.getAssociateId()==1111 && associate.getPassword().equals("saini") && associate.getEmail().equals("ha@gmail.com") && associate.getTelephone().equals("987654321")) {
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

package com.bellinfo.advance.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String fullname= req.getParameter("fullname");
		String email = req.getParameter("email");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String rePassword = req.getParameter("password1");
		String validation=null;
		if(!password.equals(rePassword)){
			validation ="passwords doesn't match";
		}
		
	    if(validation!=null){
	    	req.setAttribute("validationInfo", validation);
	    } else {
	    	req.setAttribute("validationInfo", "Successfull");
	    }
	    
	    RequestDispatcher rd = req.getRequestDispatcher("RegistrationSuccess.jsp");
	    rd.forward(req, res);
		
		
	}
	
	
	

}

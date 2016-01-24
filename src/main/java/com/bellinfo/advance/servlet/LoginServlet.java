package com.bellinfo.advance.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	
	public void init(){
		System.out.println("Register init Service called");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		String message = null;
		System.out.println("details: "+userName + " "+password);
		
		if(userName.equals("siva") && password.equals("abcd1234")){
			message = "login successful";
		} else {
			message ="login failed";
		}
		req.setAttribute("info", message);
		
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		rd.forward(req, res);
		
	}

}

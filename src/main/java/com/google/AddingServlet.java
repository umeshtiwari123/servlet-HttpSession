package com.google;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddingServlet extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		HttpSession httpSession=req.getSession();
		
		httpSession.setAttribute("k", k);
		
		res.sendRedirect("squ?k="+k); //URL Rewriting
		
		
		//req.setAttribute("k", k);
		
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		
//		rd.forward(req, res);
		
		
		
	}
}

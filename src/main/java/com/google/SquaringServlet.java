package com.google;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquaringServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession httpSession=request.getSession();
		
		//httpSession.removeAttribute("k");
		int k = (int)httpSession.getAttribute("k");

		k = k * k;
		PrintWriter out = response.getWriter();

		out.println("Result is : " + k);
		
		System.out.println("This Servlet Sq is Called");
	}
}

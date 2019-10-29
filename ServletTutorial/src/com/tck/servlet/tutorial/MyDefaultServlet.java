package com.tck.servlet.tutorial;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/" })
public class MyDefaultServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyDefaultServlet() {
	};
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletOutputStream out = resp.getOutputStream();

		out.println("<html>");
		out.println("<head><title>Page not found</title></head>");

		out.println("<body>");
		out.println("<h3>Sorry! Page not found</h3>");
		out.println("<h1>404</h1>");
		out.println("Message from servlet: " + this.getClass().getName());
		out.println("</body>");
		out.println("<html>");
	}
}

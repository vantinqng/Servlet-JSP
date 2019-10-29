package com.tck.servlet.tutorial.other;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tck.servlet.tutorial.bean.Constants;

@WebServlet(urlPatterns = { "/other/forwardDemo" })
public class ForwardDemoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ForwardDemoServlet() {
	};

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String foward = req.getParameter("forward");
		if ("true".equals(foward)) {
			System.out.println("Forward to ShowMeServlet");
			req.setAttribute(Constants.ATTRIBUTE_USER_NAME_KEY, "Hello Tin come from Java Servlet");
			RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/showMe");
			dispatcher.forward(req, resp);
		}
		ServletOutputStream out = resp.getOutputStream();
        out.println("<h3>Text of ForwardDemoServlet</h3>");
        out.println("- servletPath=" + req.getServletPath());
	}
}

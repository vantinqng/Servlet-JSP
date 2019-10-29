package com.tck.servlet.tutorial.other;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tck.servlet.tutorial.bean.Constants;
@WebServlet(urlPatterns = {"/showMe"})
public class ShowMeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String value=(String) req.getAttribute(Constants.ATTRIBUTE_USER_NAME_KEY);
		ServletOutputStream out = resp.getOutputStream();
		out.println("<h1>ShowMeServlet</h1>");
		out.println(value);
	}
}

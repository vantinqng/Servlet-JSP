package com.tck.servlet.tutorial;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;

	public void init(ServletConfig conf) throws ServletException {
		super.init(conf);
		this.email = conf.getInitParameter("gmail");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email2 = this.getServletConfig().getInitParameter("yahoo");
		ServletOutputStream out = resp.getOutputStream();
		out.println("<html");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(this.email + "</p>" + email2);
		out.println("</body>");
		out.println("</html>");
	}
}

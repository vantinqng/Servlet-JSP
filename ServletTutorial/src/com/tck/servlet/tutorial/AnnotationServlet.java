package com.tck.servlet.tutorial;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/annotation", "/annotationExample" }, initParams = {
		@WebInitParam(name = "gmail", value = "vantinqng@gmail.com"),
		@WebInitParam(name = "yahoo", value = "minhkhue@yahoo.com") })
public class AnnotationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mail;

	public AnnotationServlet() {
	};

	@Override
	public void init(ServletConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		super.init(conf);
		this.mail = conf.getInitParameter("gmail");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mail2 = this.getServletConfig().getInitParameter("yahoo");
		ServletOutputStream out = resp.getOutputStream();
		out.println("<html");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(this.mail + "</p>" + mail2);
		out.println("</body>");
		out.println("</html>");

	}
}

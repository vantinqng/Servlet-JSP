package com.tck.servlet.tutorial.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tck.servlet.tutorial.bean.Constants;
import com.tck.servlet.tutorial.bean.UserInfo;

@WebServlet(urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletOutputStream out = resp.getOutputStream();
		HttpSession sess = req.getSession();
		UserInfo info = new UserInfo("Tin", 5, "Quang Ngai");
		sess.setAttribute(Constants.SESSION_USER_KEY, info);
		out.println("<html>");
		out.println("<head><title>Session example</title></head>");

		out.println("<body>");
		out.println("<h3>You are logined!, info stored in session</h3>");

		out.println("<a href='viewInfo'>View User Info</a>");
		out.println("</body>");
		out.println("<html>");
	}
}

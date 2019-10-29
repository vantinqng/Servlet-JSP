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

@WebServlet(urlPatterns = { "/viewInfo" })
public class ViewInfo extends HttpServlet {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletOutputStream out=resp.getOutputStream();
		HttpSession session=req.getSession();
		UserInfo info=(UserInfo) session.getAttribute(Constants.SESSION_USER_KEY);
		if(info==null) {
			resp.sendRedirect(this.getServletContext().getContextPath()+"/login");
			
		}
		out.println("<html>");
        out.println("<head><title>Session example</title></head>");
 
        out.println("<body>");
 
        out.println("<h3>User Info:</h3>");
 
        out.println("<p>User Name:" + info.getUserName() + "</p>");
        out.println("<p>Country:" + info.getCountry() + "</p>");
        out.println("<p>Post:" + info.getPost() + "</p>");
 
        out.println("</body>");
        out.println("<html>");
	}
}

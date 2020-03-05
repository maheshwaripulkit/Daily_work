package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class signupcheck
 */
@WebServlet("/signupcheck")
public class signupcheck extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("firstname");
		String emailid = req.getParameter("emailid");

		String password = req.getParameter("pwd");
		String checkbox[]=req.getParameterValues("gender");
		PrintWriter pw=resp.getWriter();
		if(checkbox!=null)
		{
			for(String lan: checkbox)
			{
			pw.write(lan);
			}
		}
	}
}

package com.cts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Anil")
public class MyServlet extends HttpServlet {
 @Override
 
public void init() throws ServletException {
	// TODO Auto-generated method stub
System.out.println("init statement");
}
 
 @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	System.out.println("from service it ");
	}


@Override
	public void destroy() {
		// TODO Auto-generated method stub
	System.out.println("from destroy it gets called only once");
	}

}


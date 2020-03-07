package com.cts;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/sf")
public class SecondFilter implements Filter {

	@Override
	public void destroy() {
				System.out.println("from destroy method of second filter");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		System.out.println("from dofilter of second filter ");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println(" from init method of second filter");
		
	}

}

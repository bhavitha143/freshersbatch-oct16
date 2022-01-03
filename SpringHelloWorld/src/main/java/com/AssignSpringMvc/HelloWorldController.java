package com.AssignSpringMvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("url-patterns=/hello")
public class HelloWorldController  extends HttpServlet {
protected void doGet(HttpServletRequest request,HttpServletResponse response ) throws IOException {
	response.setContentType("heloWorld/htm");
	request.getRequestDispatcher("/webapp/WEB-INF/View/helloworld");
	PrintWriter out = response.getWriter();
	out.print("<htm>");
	out.print("<body>HelloWorld controller</body>");
	out.print("<htm>");
	
}
}

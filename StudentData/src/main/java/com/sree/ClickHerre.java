package com.sree;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClickHerre
 */
@WebServlet("/ClickHerre")
public class ClickHerre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClickHerre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name=request.getParameter("stname");
		String regNo=request.getParameter("regno");
		String uniName=request.getParameter("uniname");
		String clgName=request.getParameter("clgname");
		String courseName=request.getParameter("courname");
		String deptName=request.getParameter("deptname");
		
		PrintWriter out=response.getWriter();
		
		out.println( );
		out.println("Name: "+name);
		out.println( );
		out.println("Register Number: "+regNo);
		out.println( );
		out.println("University Name: "+uniName);
		out.println( );
		out.println("College Name: "+clgName);
		out.println( );
		out.println("Course Name: "+courseName);
		out.println( );
		out.println("Department Name: "+deptName);
	}

}

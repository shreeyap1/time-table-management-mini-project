package com.project.studentlogin;

import java.util.*;

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class StudentloginServlet
 */
@WebServlet("/StudentloginServlet")
public class StudentloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final String password="kmit123$";
	 private final HashMap<String, String> students = new HashMap<>();

	    public StudentloginServlet() {
	    	try
	        {
	            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\D Shashank\\Desktop\\02-HTML-Fundamentals\\Java Project\\info\\Student info.txt"));
	            String currentLine = reader.readLine();

	            while (currentLine != null)
	            {

	                String[] words = currentLine.split("\t");
	               // System.out.println(words[0]+" "+words[1]);
	                students.put(words[0],words[1]);
	                currentLine = reader.readLine();
	            }
	            //reader.close();
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
	
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		String upass = request.getParameter("pass");
		//String section="";
		if (students.containsKey(uname) && upass.equals("kmit123$")) {
            request.getSession().setAttribute("userRole", "faculty");
            String section=students.get(uname);
            request.getSession().setAttribute("uname", uname);
            request.getSession().setAttribute("section", section);
            //request.getSession().setAttribute("students", students);
            response.sendRedirect("studentOptions.jsp");
//            PrintWriter out = response.getWriter();
//            out.print(section);
        } else {
            response.sendRedirect("index.jsp?loginFailed=true");
        }
		
    }
	
	      
}

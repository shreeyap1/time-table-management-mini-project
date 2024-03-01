// StudentTimetableServlet.java
package com.project.studentlogin;
import java.io.IOException;
import java.io.PrintWriter;

import java.nio.file.Files;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TimetableServlet")
public class TimetableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String studentId = (String) request.getSession().getAttribute("uname");
        String sec = (String) request.getSession().getAttribute("section");
        if (studentId == null) {
            response.sendRedirect("index.jsp");
            return;
        }
        switch(sec)
        {
        case "A":
        	String filePath = "C:\\Users\\D Shashank\\Desktop\\Timetables\\CSE A.pdf";
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "inline; filename=CSE A.pdf");
            Files.copy(Paths.get(filePath), response.getOutputStream());
            break;
        case "B":
        	String filePath1 = "C:\\Users\\D Shashank\\Desktop\\Timetables\\CSE B.pdf";
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "inline; filename=CSE B.pdf");
            Files.copy(Paths.get(filePath1), response.getOutputStream());
            break;
        case "C":
        	String filePath2 = "C:\\Users\\D Shashank\\Desktop\\Timetables\\CSE C.pdf";
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "inline; filename=CSE C.pdf");
            Files.copy(Paths.get(filePath2), response.getOutputStream());
            break;
        case "D":
        	String filePath3 = "C:\\Users\\D Shashank\\Desktop\\Timetables\\CSE D.pdf";
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "inline; filename=CSE D.pdf");
            Files.copy(Paths.get(filePath3), response.getOutputStream());
            break;
        case "E":
        	String filePath4 = "C:\\Users\\D Shashank\\Desktop\\Timetables\\CSE E.pdf";
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "inline; filename=CSE E.pdf");
            Files.copy(Paths.get(filePath4), response.getOutputStream());
            break;
        case "F":
        	String filePath5 = "C:\\Users\\D Shashank\\Desktop\\Timetables\\CSE F.pdf";
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "inline; filename=CSE F.pdf");
            Files.copy(Paths.get(filePath5), response.getOutputStream());
            break;
        case "G":
        	String filePath6 = "C:\\Users\\D Shashank\\Desktop\\Timetables\\CSE G.pdf";
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "inline; filename=CSE G.pdf");
            Files.copy(Paths.get(filePath6), response.getOutputStream());
            break;
        default:
        	PrintWriter out = response.getWriter();
        	out.print("Sorry! The given roll no. is not present.");
        	break;
        	
        }

        
    }
}

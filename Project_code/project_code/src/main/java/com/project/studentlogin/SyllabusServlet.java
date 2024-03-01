// StudentSyllabusServlet.java
package com.project.studentlogin;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SyllabusServlet")
public class SyllabusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String studentId = (String) request.getSession().getAttribute("uname");
        if (studentId == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        // Assuming facultySyllabus.pdf is the name of the PDF file for faculty's syllabus
        String filePath = "C:\\Users\\D Shashank\\Desktop\\Timetables\\syllabus.pdf";
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "inline; filename=syllabus.pdf");
        Files.copy(Paths.get(filePath), response.getOutputStream());
    }
}

package project.FacultyManager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/FacultyLoginServlet")
public class FacultyLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String facultyId = request.getParameter("username");
        String password = request.getParameter("password");

        FacultyManager.Faculty faculty = FacultyManager.getFacultyById(facultyId);

        if (faculty != null && faculty.getPassword().equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("facultyId", faculty.getId());
            session.setAttribute("section", faculty.getSection());
            response.sendRedirect("facultyOptions.jsp");
        } else {
            response.sendRedirect("facultyLogin.jsp?loginFailed=true");
        }
    }
}

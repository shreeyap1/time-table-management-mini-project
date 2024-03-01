package project;

// FacultySyllabusServlet.java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FacultySyllabusServlet")
public class FacultySyllabusServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String facultyId = (String) request.getSession().getAttribute("userId");
        String filePath ="C:\\Users\\DELL\\Downloads\\syllabus.pdf";
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "inline; filename=syllabus.pdf");
        Files.copy(Paths.get(filePath), response.getOutputStream());
    }
}

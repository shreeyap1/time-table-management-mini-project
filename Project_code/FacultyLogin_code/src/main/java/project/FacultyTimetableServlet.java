package project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/FacultyTimetableServlet")
public class FacultyTimetableServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String section = (String) session.getAttribute("section");
        if (section == null) {
            response.sendRedirect("facultyLogin.jsp");
            return;
        }
        String pdfFilePath = getTimetablePdfPathForSection(section);
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "inline; filename=syllabus.pdf");
        Files.copy(Paths.get(pdfFilePath), response.getOutputStream());
    }
    private String getTimetablePdfPathForSection(String section) {
        HashMap<String, String> sectionPdfMap = new HashMap<>();
        sectionPdfMap.put("A", "C:\\Users\\DELL\\Downloads\\CSE A.pdf");
        sectionPdfMap.put("B", "C:\\Users\\DELL\\Downloads\\CSE B.pdf");
        sectionPdfMap.put("C", "C:\\Users\\DELL\\Downloads\\CSE C.pdf");
        sectionPdfMap.put("D", "C:\\Users\\DELL\\Downloads\\CSE D.pdf");
        sectionPdfMap.put("E", "C:\\Users\\DELL\\Downloads\\CSE E.pdf");
        sectionPdfMap.put("F", "C:\\Users\\DELL\\Downloads\\CSE F.pdf");
        sectionPdfMap.put("G", "C:\\Users\\DELL\\Downloads\\CSE G.pdf");
        sectionPdfMap.put("H", "C:\\Users\\DELL\\Downloads\\CSE A_merged.pdf");
        return sectionPdfMap.get(section);
    }
}

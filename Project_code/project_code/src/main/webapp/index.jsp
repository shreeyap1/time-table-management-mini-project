<%--
	if(session.getAttribute("uname")==null){
		response.sendRedirect("StudentLogin.jsp");
	}
--%>
<!DOCTYPE html>
<html>
  <head>
    <title>Student Login</title>
    <link rel="stylesheet" type="text/css" href="styles.css" />
    <style></style>
  </head>
  <body>
  <input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
    <div class="container">
      <h1>Welcome, Student!</h1>
      <form action="StudentloginServlet" method="post">
        <input type="text" placeholder="Username" required name="name" />
        <input type="password" placeholder="Password" required name="pass" />
        <button type="submit">Login</button>
      </form>
    </div>
    <div class="images-container">
      <img src="digital-india-microsoft.jpeg.jpg" alt="Image 1" />
      <img src="ece-group-photo_small.jpg" alt="Image 2" />
    </div>
    <div class="images-container">
      <img src="fs-cs-lab.jpg" alt="Image 3" />
      <img src="kmit-radio-team.jpg" alt="Image 4" />
    </div>
    
    <%
    //String sec =request.getParameter("section");
    //switch(sec)
    //{
    //case "A":
    	
    //}
    %>
  </body>
</html>

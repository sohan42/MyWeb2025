<%-- 
    Document   : Login
    Created on : Feb 3, 2026, 7:33:06 AM
    Author     : Sohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="login-container">
        <h2>Login</h2>
        <form action="Login.jsp" method="post">
            <input type="text" name="username" placeholder="Username" required><br><br>
            <input type="password" name="password" placeholder="Password" required><br><br>
            <input type="submit" value="Login">
        </form>
        <%
            // Check if the form has been submitted
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // Simple validation
            if (username != null && password != null) {
                if (username.equals("Raj") && password.equals("Raj123")) {
                    out.println("<p style='color:green;'>Login successful!</p>");
                } else {
                    out.println("<p style='color:red;'>Invalid username or password</p>");
                }
            }
        %>
        </div>
    </body>
</html>

<%-- Create a JSP with a text box to enter a number and a button. 
It should calculate factorial of a number and display when button is clicked.--%>

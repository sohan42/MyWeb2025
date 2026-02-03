<%-- 
    Document   : JSP1
    Created on : Feb 3, 2026, 7:19:10 AM
    Author     : Sohan
--%>

<%-- Simple Program to dmonstrate JSP.--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%String name = "Himal";
          out.println("Name:  " + name);
        %>
    </body>
</html>

<%-- To run browse http://localhost:8080/MyWeb2025/JSP1.jsp --%>
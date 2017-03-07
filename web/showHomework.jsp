<%-- 
    Document   : showHomework
    Created on : 6/03/2017, 08:46:29 AM
    Author     : usuario
--%>

<%@page import="Homework.Homework"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homework </title>
        <link rel="stylesheet" type="text/css" href="css/basicStyle.css">
    </head>
    <body>
        <h1>Show Homework</h1>
            
        <% Homework hw = (Homework)request.getAttribute("hw"); %>
        <label>Name:</label>
        <%= hw.getName()%>
        <label>Grade:</label>
        <%= hw.getGrade()%>
        <label>Folder:</label>
        <%= hw.getFolder()%>
        <br>            
        <a href="listHomework.jsp">Got to List</a>
            
    </body>
</html>

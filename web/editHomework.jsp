<%-- 
    Document   : editHomework.jsp
    Created on : Mar 6, 2017, 10:52:25 PM
    Author     : laq
--%>

<%@page import="Homework.Homework"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Homework</title>
    </head>
    <body>
        <% Homework hw = (Homework)request.getAttribute("hw"); %>
        <h1>Edit Homework</h1>
        <form action="EditHomework" method="POST">
            <label for="name">Homework Name:</label>
            <input name="name" value="<%= hw.getName()%>">
            <label>Grade:</label>
            <input name="grade" type="number" min="0" max="5" value="<%= hw.getGrade()%>">
            <label>Address:</label>
            <input name="folder" value="<%= hw.getFolder()%>">
            <input name="id" value="<%= hw.getId()%>" hidden="">
            <input type="submit" value="Cambiar Tarea">                
        </form>
    </body>
</html>

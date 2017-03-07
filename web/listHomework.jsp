<%-- 
    Document   : listHomework
    Created on : 6/03/2017, 08:52:31 AM
    Author     : usuario
--%>

<%@page import="java.util.List"%>
<%@page import="Homework.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Homeworks</title>
        <link rel="stylesheet" type="text/css" href="css/basicStyle.css">
    </head>
    <body>
        <h1>Homeworks List</h1>    
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Grade</th>
                    <th>Folder</th>
                    <th>Edit</th>
                    <th>Delete</th>                    
                </tr>
            </thead>
            <tbody>
                <% List<Homework> list = HomeworkList.getList(); %>        
                <% for (Homework hw : list) { %>
                <tr>
                    <td> <%= hw.getName()%></td>
                    <td> <%= hw.getGrade()%></td>
                    <td> <%= hw.getFolder()%></td>
                    <td> <a class="yellow noUnderline" href="EditHomework?id=<%= hw.getId()%>">📝</a></td>
                    <td> <a class="red noUnderline" href="DeleteHomework?id=<%= hw.getId()%>">🚫</a></td>
                </tr>
                <% }%>       
            </tbody>
        </table>



        <br>
        <a href="createHomework.jsp">New Homework</a>
    </body>
</html>

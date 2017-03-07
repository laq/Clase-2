<%-- 
    Document   : createHomework
    Created on : 6/03/2017, 08:36:23 AM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create homework</title>
    </head>
    <body>
        <h1>Hi, which home work do you want to create?</h1>
        
        <form action="CreateHomework" method="POST">
            <label for="name">Homework Name:</label>
            <input name="name">
            <label>Grade:</label> <input name="grade" type="number" min="0" max="5">
            <label>Address</label>
            <input name="address">
            <input type="submit" value="Agregar Tarea">                
        </form>
            
    </body>
</html>

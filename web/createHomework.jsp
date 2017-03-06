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
        <h1>Hi which home work do you want to create?</h1>
        
        <form action="CreateHomework" method="POST">
            Homework Name: <input name="name"><br>
            Grade: <input name="grade" type="number"><br>
            Address: <input name="address"><br>
            <input type="submit">                
        </form>
            
    </body>
</html>

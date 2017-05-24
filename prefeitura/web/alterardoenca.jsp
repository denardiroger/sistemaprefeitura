<%-- 
    Document   : alterardoenca
    Created on : 22/05/2017, 14:59:34
    Author     : rogerd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="index.jsp"/>
        <br>
        <h3>Alterar doença</h3>
        <br>
        <form action="Scontroler?acao=alterandodoenca" method="POST">
            Nome:
            <br>
            <input type="text" required="required" pattern="[a-z\s]+$" maxlength="50" size="40">
            <br>
            <br>
            <input type="submit" value="Salvar">
            <input type="submit" value="Cancelar">
        </form>
    </body>
</html>

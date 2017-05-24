<%-- 
    Document   : inserirdoenca
    Created on : 22/05/2017, 15:04:25
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
        <h3>Cadastro de doenças</h3>
        <br>
        <form action="Scontroler?acao=inserirdoenca" method="POST">
            Cid:<br>
            <input type="text" required="required" name="cid">

            <br>
            Nome:
            <br>
            <input type="text" required="required" name="nome" pattern="[a-z\s]+$" maxlength="50" size="40">
            <br>
            <br>
            <input type="submit" value="Salvar">
            <input type="submit" value="Cancelar">
        </form>
    </body>
</html>

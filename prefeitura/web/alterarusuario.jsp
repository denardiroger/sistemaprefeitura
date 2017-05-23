<%-- 
    Document   : alterarcliente
    Created on : 22/05/2017, 14:58:36
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
        <h3>Alterar usuario</h3>
         <form>
            Nome:
            <br>
            <input type="text" required="required" pattern="[a-z]+$" maxlength="50" size="40">
            <br>
            email:
            <br>
            <input type="email" name="email" required="required" pattern= "[^@\s]+@[^@\s]+\.[^@\s]+"  maxlength="50">
            <br>
            Senha:
            <br>
            <input type="password" required="required" pattern="[a-z]+$" maxlength="16" size="20">
            <br>
            Nível:
            <br>
            <input type="radio" name="sexo" value="administrador">Administrador<br>
            <input type="radio" name="sexo" value="usuário" checked>Usuário<br>
            <br>
            <input type="submit" value="Salvar">
            <input type="submit" value="Cancelar">
        </form>
    </body>
</html>

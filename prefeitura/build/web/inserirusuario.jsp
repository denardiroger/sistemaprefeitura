<%-- 
    Document   : inserirusuario
    Created on : 22/05/2017, 15:05:53
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
        <h3>Cadastro de usuarios</h3>
        <br>
        <form action="Scontroler?acao=inserirusuario" method="POST">
        Nome:
            <br>
            <input type="text" required="required" name="nome" pattern="[a-z]+$" maxlength="50" size="40">
            <br>
             email:
        <br>
        <input type="email" name="email" required="required" pattern= "[^@\s]+@[^@\s]+\.[^@\s]+"  maxlength="50">
        <br>
         Senha:
            <br>
            <input type="password" required="required" name="senha" pattern="[a-z]+$" maxlength="16" size="20">
            <br>
         Nível:
         <br>
          <input type="radio" name="nivel" value="administrador">Administrador<br>
          <input type="radio" name="nivel" value="usuário" checked>Usuário<br>
          <br>
          <input type="submit" value="Salvar">
          <input type="submit" value="Cancelar">
        </form>
    </body>
</html>

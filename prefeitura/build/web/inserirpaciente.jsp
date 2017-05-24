<%-- 
    Document   : inserirpaciente
    Created on : 22/05/2017, 15:04:56
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
        <h3>Cadastro de pacientes</h3>
        <br>
        <form action="Scontroler?acao=inserirpaciente" method="POST">
        CPF:
        <br>
        <input type="text" name="cpf" pattern="[0-9]{11}" title="exemplo: 034....." required="required" maxlength="11">
        <br>
         Nome:
        <br>
        <input type="text" name="nome" required="required" pattern="[a-z\s]+$" maxlength="50" size="40">
        <br>
        Sexo:
        <br>
        <input type="radio" name="sexo" value="masculino">Masculino</br>
        <input type="radio" name="sexo" value="feminino">Feminino</br>
         Data de nascimento:
        <br>
        <input type="date" required="required">
        <br>
        Nome da Mãe:
        <br>
        <input type="text" name="nomemae" required="required" pattern="[a-z\s]+$" maxlength="50" size="40">
        <br>
        
        <input type="submit" value="Salvar">
        <input type="submit" value="Cancelar">
        </form>
    </body>
</html>

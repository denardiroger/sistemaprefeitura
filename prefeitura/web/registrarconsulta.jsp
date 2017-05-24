<%-- 
    Document   : registrarconsulta
    Created on : 22/05/2017, 15:07:48
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
        <h3>Registro de consultas</h3>
        <br>
        <form action="Scontroler?acao=registrarconsulta" method="POST">
            Paciente:
            <input type="text" required="required" pattern="[a-z\s]+$" maxlength="50" size="20">
            <input type="submit" value="Buscar">
            <br>
            <br>
            Selecione o paciente:
            <!--esse select retorna uma lista de pacientes através da consulta feita com o valor do campo nome acima -->
            <br>
            <input type="radio" name="nome" checked>Roger<br>
            <input type="radio" name="nome">Rodrigo<br>
          <input type="radio" name="nome">Cristiano<br>
          
            
            <br>
             Doença:
            <input type="text" required="required" pattern="[a-z\s]+$" maxlength="50" size="20">
            <input type="submit" value="Buscar">
            <br>
            
            Selecione a doença:
            <!--esse select retorna uma lista de doenças através da consulta feita com o valor do campo nome acima -->
            <br>
            <input type="radio" name="doenca" checked>Sífilis<br>
            <input type="radio" name="doenca">Aids<br>
          
            <br>
            <br>
            <input type="submit" value="Salvar">
            <input type="submit" value="Cancelar">
        </form>
    </body>
</html>

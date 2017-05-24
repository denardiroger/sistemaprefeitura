<%-- 
    Document   : login
    Created on : 22/05/2017, 15:06:51
    Author     : rogerd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/css_login.css">
    </head>
    <body>
        <div class="container">
            <img src="imagem/doctor.png">
            <form action="Scontroler?acao=login" method="GET" >
                <div class="form-input">
                    <input type="text" name="username" placeholder="Usuário">
                </div>
                <div class="form-input">
                    <input type="password" name="username" placeholder="Senha">
                </div>
                <input type="submit" name="Login" value="Login" id="btl" >
                <br>
                <a href="Scontroler?acao=esqueceuasenha">Esqueci a Senha</a>
            </form>
        </div>
    </body>
</html>

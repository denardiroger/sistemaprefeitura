<%-- 
    Document   : index
    Created on : 22/05/2017, 15:00:18
    Author     : rogerd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" type="text/css"  href="css/estilo.css" />
    </head>
    <body>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li class="dropdown"><a href="#" class="dropdown-btn">Usuario</a>
                <div class="dropdown-menu">
                    <a href="inserirusuario.jsp">cadastrar usuario</a>
                </div>
            
            </li>
            <li class="dropdown"><a href="#" class="dropdown-btn">Paciente</a>
                <div class="dropdown-menu">
                    <a href="inserirpaciente.jsp">cadastrar paciente</a>
                </div>
            
            </li>
            <li class="dropdown"><a href="#" class="dropdown-btn">Doença</a>
                <div class="dropdown-menu">
                    <a href="inserirdoenca.jsp">cadastrar doença</a>
                </div>
            
            </li>
            <li class="dropdown"><a href="#" class="dropdown-btn">Consulta</a>
                <div class="dropdown-menu">
                    <a href="registrarconsulta.jsp">registrar consulta</a>
                    <a href="#">ver consulta</a>
                </div>
            
            </li>
             <li class="dropdown"><a href="#" class="dropdown-btn">Estatísticas</a>
                <div class="dropdown-menu">
                    <a href="verestatistica.jsp">ver estatisticas</a>
                </div>
            
            </li>
            <li id="sair"><a href="#">Sair</a></li>
        </ul>
    </body>
</html>

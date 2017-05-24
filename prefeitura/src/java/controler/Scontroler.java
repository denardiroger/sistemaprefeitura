/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.doenca_dao;
import dao.paciente_dao;
import dao.usuario_dao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.doenca;
import model.paciente;
import model.usuario;

/**
 *
 * @author rogerd
 */
public class Scontroler extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String acao = request.getParameter("acao");
            if(acao.equals("inserirdoenca")){
                doenca doenca = new doenca();
                doenca.setCid(Integer.parseInt(request.getParameter("cid")));
                doenca.setNome(request.getParameter("nome"));
                doenca_dao dao = new doenca_dao();
                dao.inserir_doenca(doenca);
                List lista = dao.listar_doenca();
                request.setAttribute("lista", lista);
                RequestDispatcher view = request.getRequestDispatcher("consultardoenca.jsp");
                view.forward(request, response);
            }else{
                if(acao.equals("inserirusuario")){
                    usuario usuario = new usuario();
                    usuario.setNome(request.getParameter("nome"));
                    usuario.setEmail(request.getParameter("email"));
                    usuario.setSenha(request.getParameter("senha"));
                    usuario.setNivel(request.getParameter("nivel"));
                    usuario_dao dao = new usuario_dao();
                    dao.inserir_usuario(usuario);
                    List lista = dao.listar_usuario();
                request.setAttribute("lista", lista);
                RequestDispatcher view = request.getRequestDispatcher("consultarusuario.jsp");
                view.forward(request, response);
                }else{
                    if(acao.equals("inserirpaciente")){
                        paciente paciente = new paciente();
                        paciente.setCpf(request.getParameter("cpf"));
                        paciente.setNome(request.getParameter("nome"));
                        paciente.setNome_mae(request.getParameter("nomemae"));
                        paciente.setSexo(request.getParameter("sexo"));
                        paciente.setNascimento(request.getParameter("data"));
                        paciente_dao dao = new paciente_dao();
                        dao.inserir_paciente(paciente);
                        List lista = dao.listar_paciente();
                        request.setAttribute("lista", lista);
                RequestDispatcher view = request.getRequestDispatcher("consultarusuario.jsp");
                view.forward(request, response);
                    }
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Scontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Scontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

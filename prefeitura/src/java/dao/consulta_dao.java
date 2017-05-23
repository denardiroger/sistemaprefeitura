/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.UnavailableException;
import model.consulta;

/**
 *
 * @author rogerd
 */
public class consulta_dao {
    private Connection con;
    public void Conectar() throws UnavailableException{
   try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaprefeitura", "root", "");

        } catch (Exception e) {
            throw new UnavailableException(e.toString());
        }
    }
    public consulta_dao() throws UnavailableException{
        Conectar();
    }
    public void inserir_consulta(consulta consulta){
        try {
            PreparedStatement pstmt = con.prepareCall("INSERT INTO consulta VALUES(NULL,?,?,?)");
            pstmt.setString(1, consulta.getData());
            pstmt.setInt(2, consulta.getCodigo_usuario());
            pstmt.setString(3, consulta.getCpf_paciente());
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(" " + e.getMessage());
        }
    }
     public void excluir_consulta(consulta consulta){
        try {
            PreparedStatement pstmt = con.prepareCall("DELETE FROM consulta WHERE codigo = ? ");
            pstmt.setInt(1, consulta.getCodigo());
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(" " + e.getMessage());
        }
    }
     public void alterar_consulta(consulta consulta){
        try {
            PreparedStatement pstmt = con.prepareCall("UPDATE consulta SET data = ? , codigo_usuario = ?, cpf_paciente = ? WHERE codigo = ?");
            pstmt.setString(1, consulta.getData());
            pstmt.setInt(2, consulta.getCodigo_usuario());
            pstmt.setString(3, consulta.getCpf_paciente());
            pstmt.setInt(4, consulta.getCodigo());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
        }
    }
     public List consultar(consulta consulta) throws SQLException {
        try {
            PreparedStatement pstmt = con.prepareCall("SELECT * FROM consulta WHERE codigo = ?");
            pstmt.setInt(1, consulta.getCodigo());
            ResultSet rs = pstmt.executeQuery();

            List<consulta> listadeconsulta = new ArrayList<consulta>();
            while (rs.next()) {
                consulta consulta2 = new consulta();
                consulta2.setCodigo(Integer.parseInt(rs.getString("codigo")));
                consulta2.setData(rs.getString("data"));
                consulta2.setCodigo_usuario(Integer.parseInt(rs.getString("codigo_usuario")));
                consulta2.setCpf_paciente(rs.getString("cpf_paciente"));
                listadeconsulta.add(consulta2);

            }
            pstmt.close();
            rs.close();
            return listadeconsulta;
        } catch (SQLException e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }
      public List listar_consulta() throws SQLException {
        try {
            PreparedStatement pstmt = con.prepareCall("SELECT * FROM consulta");
            ResultSet rs = pstmt.executeQuery();

            List<consulta> listadeconsulta = new ArrayList<consulta>();
            while (rs.next()) {
                consulta consulta = new consulta();
                consulta.setCodigo(Integer.parseInt(rs.getString("codigo")));
                consulta.setData(rs.getString("data"));
                consulta.setCodigo_usuario(Integer.parseInt(rs.getString("codigo_usuario")));
                consulta.setCpf_paciente(rs.getString("cpf_paciente"));
                listadeconsulta.add(consulta);
                

            }
            pstmt.close();
            rs.close();
            return listadeconsulta;
        } catch (SQLException e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }
    
    
}

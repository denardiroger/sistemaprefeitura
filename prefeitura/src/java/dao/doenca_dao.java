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
import model.doenca;

/**
 *
 * @author rogerd
 */
public class doenca_dao {
    private Connection con;
    public void Conectar() throws UnavailableException{
   try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaprefeitura", "root", "");

        } catch (Exception e) {
            throw new UnavailableException(e.toString());
        }
    }
    public doenca_dao() throws UnavailableException{
        Conectar();
    }
     public void inserir_doenca(doenca doenca){
        try {
            PreparedStatement pstmt = con.prepareCall("INSERT INTO doenca VALUES(?,?)");
            pstmt.setInt(1, doenca.getCid());
            pstmt.setString(2, doenca.getNome());
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(" " + e.getMessage());
        }
    }
     public void excluir_doenca(doenca doenca){
        try {
            PreparedStatement pstmt = con.prepareCall("DELETE FROM doenca WHERE cid = ? ");
            pstmt.setInt(1, doenca.getCid());
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(" " + e.getMessage());
        }
    }
     public void alterar_doenca(doenca doenca){
        try {
            PreparedStatement pstmt = con.prepareCall("UPDATE doenca SET nome = ? WHERE cid = ?");
            pstmt.setString(1, doenca.getNome());
            pstmt.setInt(2, doenca.getCid());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
        }
    }
     public List consultar(doenca doenca) throws SQLException {
        try {
            PreparedStatement pstmt = con.prepareCall("SELECT * FROM doenca WHERE cid = ?");
            pstmt.setInt(1, doenca.getCid());
            ResultSet rs = pstmt.executeQuery();

            List<doenca> listadedoenca = new ArrayList<doenca>();
            while (rs.next()) {
                doenca doenca2 = new doenca();
                doenca2.setCid(Integer.parseInt(rs.getString("cid")));
                doenca2.setNome(rs.getString("nome"));
                listadedoenca.add(doenca2);

            }
            pstmt.close();
            rs.close();
            return listadedoenca;
        } catch (SQLException e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }
      public List listar_doenca() throws SQLException {
        try {
            PreparedStatement pstmt = con.prepareCall("SELECT * FROM doenca");
            ResultSet rs = pstmt.executeQuery();

            List<doenca> listadedoenca = new ArrayList<doenca>();
            while (rs.next()) {
                doenca doenca = new doenca();
                doenca.setCid(Integer.parseInt(rs.getString("cid")));
                doenca.setNome(rs.getString("nome"));
                listadedoenca.add(doenca);

            }
            pstmt.close();
            rs.close();
            return listadedoenca;
        } catch (SQLException e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }
    
}

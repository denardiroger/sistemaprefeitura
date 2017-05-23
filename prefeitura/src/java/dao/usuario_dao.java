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
import model.usuario;

/**
 *
 * @author rogerd
 */
public class usuario_dao {
    private Connection con;
    public void Conectar() throws UnavailableException{
   try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaprefeitura", "root", "");

        } catch (Exception e) {
            throw new UnavailableException(e.toString());
        }
    }
    public usuario_dao() throws UnavailableException{
        Conectar();
    }
     public void inserir_usuario(usuario usuario){
        try {
            PreparedStatement pstmt = con.prepareCall("INSERT INTO usuario VALUES(NULL,?,?,?,?,DEFAULT)");
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getEmail());
            pstmt.setString(3, usuario.getSenha());
            pstmt.setString(4, usuario.getNivel());
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(" " + e.getMessage());
        }
    }
     public void excluir_usuario(usuario usuario) throws SQLException{
        try {
            PreparedStatement pstmt = con.prepareCall("DELETE FROM usuario WHERE codigo = ?");
            pstmt.setInt(1, usuario.getCodigo());
            pstmt.execute();
            pstmt.close();
    }catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
        }
    }
     public void alterar_usuario(usuario usuario){
        try {
            PreparedStatement pstmt = con.prepareCall("UPDATE usuario SET nome = ?, email = ?, senha = ?, nivel = ? WHERE codigo = ?");
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getEmail());
            pstmt.setString(3, usuario.getSenha());
            pstmt.setString(4, usuario.getNivel());
            pstmt.setInt(5, usuario.getCodigo());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
        }
    }
     public List consultar(usuario usuario) throws SQLException {
        try {
            PreparedStatement pstmt = con.prepareCall("SELECT * FROM usuario WHERE codigo = ?");
            pstmt.setInt(1, usuario.getCodigo());
            ResultSet rs = pstmt.executeQuery();

            List<usuario> listadeusuario = new ArrayList<usuario>();
            while (rs.next()) {
                usuario usuario2 = new usuario();
                usuario2.setCodigo(Integer.parseInt(rs.getString("codigo")));
                usuario2.setNome(rs.getString("nome"));
                usuario2.setEmail(rs.getString("email"));
                usuario2.setSenha(rs.getString("senha"));
                usuario2.setNivel(rs.getString("nivel"));
                listadeusuario.add(usuario2);

            }
            pstmt.close();
            rs.close();
            return listadeusuario;
        } catch (SQLException e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }
     public List listar_usuario() throws SQLException {
        try {
            PreparedStatement pstmt = con.prepareCall("SELECT * FROM usuario");
            ResultSet rs = pstmt.executeQuery();

            List<usuario> listadeusuario = new ArrayList<usuario>();
            while (rs.next()) {
                usuario usuario = new usuario();
                usuario.setCodigo(Integer.parseInt(rs.getString("codigo")));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setNivel(rs.getString("nivel"));
                listadeusuario.add(usuario);

            }
            pstmt.close();
            rs.close();
            return listadeusuario;
        } catch (SQLException e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }

    
}

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.UnavailableException;
import model.paciente;
import model.usuario;

public class paciente_dao {
    private Connection con;
    public void Conectar() throws UnavailableException{
   try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomerce", "root", "");

        } catch (Exception e) {
            throw new UnavailableException(e.toString());
        }
    }
    public paciente_dao() throws UnavailableException{
        Conectar();
    }
    
     public void inserir_paciente(paciente paciente){
        try {
            PreparedStatement pstmt = con.prepareCall("INSERT INTO paciente VALUES(?,?,?,?,?,DEFAULT)");
            pstmt.setString(1, paciente.getCpf());
            pstmt.setString(2, paciente.getNome());
            pstmt.setString(3, paciente.getNascimento());
            pstmt.setString(4, paciente.getNome_mae());            
            pstmt.setString(5, paciente.getSexo());
            pstmt.setString(6, paciente.getObito());
            
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(" " + e.getMessage());
        }
    }
     
     public void excluir_paciente(paciente paciente) throws SQLException{
        try {
            PreparedStatement pstmt = con.prepareCall("DELETE FROM paciente WHERE cpf = ?");
            pstmt.setString(1, paciente.getCpf());
            pstmt.execute();
            pstmt.close();
    }catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
        }
    }
     
     
     
     public void alterar_paciente(paciente paciente){
        try {
            PreparedStatement pstmt = con.prepareCall("UPDATE paciente SET cpf = ?, nome = ?, nascimente = ?, nome_mae = ?, sexo = ?, obito = ? WHERE cpf = ?");
            pstmt.setString(1, paciente.getCpf());
            pstmt.setString(2, paciente.getNome());
            pstmt.setString(3, paciente.getNascimento());
            pstmt.setString(4, paciente.getNome_mae());            
            pstmt.setString(5, paciente.getSexo());
            pstmt.setString(6, paciente.getObito());
            
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
        }
    }
     
     
     public List consultar_paciente(paciente paciente) throws SQLException {
        try {
            PreparedStatement pstmt = con.prepareCall("SELECT * FROM paciente WHERE cpf = ?");
            pstmt.setString(1, paciente.getCpf());
            ResultSet rs = pstmt.executeQuery();

            List<paciente> lista_paciente = new ArrayList<paciente>();
            while (rs.next()) {
                paciente paciente2 = new paciente();
                
                paciente2.setCpf(rs.getString("cpf"));
                paciente2.setCpf(rs.getString("nome"));
                paciente2.setCpf(rs.getString("nascimento"));
                paciente2.setCpf(rs.getString("nome_mae"));
                paciente2.setCpf(rs.getString("sexo"));
                paciente2.setCpf(rs.getString("obito"));
                
                lista_paciente.add(paciente2);

            }
            pstmt.close();
            rs.close();
            return lista_paciente;
        } catch (SQLException e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }
    
}

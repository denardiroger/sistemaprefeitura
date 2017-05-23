package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.UnavailableException;
import model.diagnostico;
import model.paciente;
import model.usuario;

public class diagnostico_dao {
    private Connection con;
    public void Conectar() throws UnavailableException{
   try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaprefeitura", "root", "");

        } catch (Exception e) {
            throw new UnavailableException(e.toString());
        }
    }
    public diagnostico_dao() throws UnavailableException{
        Conectar();
    }
    
     public void inserir_diagnostico(diagnostico diagnostico){
        try {
            PreparedStatement pstmt = con.prepareCall("INSERT INTO diagnostico VALUES(DEFAULT,?,?,?,?,?)");
            
            pstmt.setInt(1, diagnostico.getCodigo());
            pstmt.setInt(2, diagnostico.getCodigo_consulta());
            pstmt.setString(3, diagnostico.getData());
            pstmt.setInt(4, diagnostico.getCodigo_usuario());
            pstmt.setInt(5, diagnostico.getCpf_paciente());
            pstmt.setInt(6, diagnostico.getCid_doenca());
            
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(" " + e.getMessage());
        }
    }
     
     
     
     public void excluir_diagnostico(diagnostico diagnostico) throws SQLException{
        try {
            PreparedStatement pstmt = con.prepareCall("DELETE FROM diagnostico WHERE codigo = ?");
            pstmt.setInt(1, diagnostico.getCodigo());
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

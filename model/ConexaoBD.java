/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class ConexaoBD {
     private static Connection conexao = null;
    
    public static Connection getConexao(){
        String url = "jdbc:mysql://localhost:3306/holeritejln";
        String usuario="root";
        String senha ="1234";
        
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            
        }catch(SQLException ex){
            ex.printStackTrace();
            
        }
        return conexao;
    }
    public boolean consultaBanco(String login, int senha)
    {
        String sql;
        boolean autentica = false;
        
        PreparedStatement ps;
        sql = "select login, senha from usuario where login = ? and senha = ?";
         ResultSet rs;
         try {
             ps = conexao.prepareStatement(sql);
             ps.setString(1, login);
             ps.setInt(2, senha);
             
             rs = ps.executeQuery();
             
             if(rs.next())
             {
                 String usuario = rs.getString("login");
                 int senhaDigitada = rs.getInt("senha");
                 autentica = true;
             }
             else
             {
                 ps.close();
                 return autentica;
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Digite novamente a senha\n"+ex);
         }
        return autentica;
    }
    
}

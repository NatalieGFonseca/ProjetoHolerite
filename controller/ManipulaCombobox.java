/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;
import model.ConexaoBD;


/**
 *
 * @author User
 */
public class ManipulaCombobox{
    public static void insereDadosjComboBox(JComboBox jClista){
          
          DefaultComboBoxModel modelo = (DefaultComboBoxModel) jClista.getModel();
             modelo.removeAllElements();
       String consulta = "SELECT cpnj,nome FROM empresa order by nome";
        String item;
        Statement st;
        ResultSet rs;
      
     
        try {
                Connection conexao = ConexaoBD.getConexao();
                st = conexao.createStatement();
                rs = st.executeQuery(consulta);

                while(rs.next())
                {
                   item = (rs.getString("cpnj")+"-"+rs.getString("nome"));
                   modelo.addElement(item); 
                    
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Erro "+ex);
        }
            
              
            
          
    }
}

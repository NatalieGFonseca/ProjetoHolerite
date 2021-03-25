/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import model.ConexaoBD;


/**
 *
 * @author User
 */
public class Pesquisas {
    Connection conexao = ConexaoBD.getConexao();
    Adicionais adc;
    Descontos desc;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
     PreparedStatement ps;
   private float valor ;
   private String nome ;

  public float pesquisavalor(String cpf)
    {
            
        String consulta = "SELECT salario FROM funcionario where cpf=?";
            try {
                  ps = conexao.prepareStatement(consulta);
                 ps.setString(1, cpf);
                 rs = ps.executeQuery();

                while(rs.next())
                {
                    this.valor= rs.getFloat("salario");
                 
                }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Erro 1"+ex);
        }
     return this.valor;          
            
    }
    public String pesquisanome(String cpf){
        
        String consulta = "SELECT nomefuncionario FROM funcionario where cpf=?";
            try {
                  ps = conexao.prepareStatement(consulta);
                 ps.setString(1, cpf);
                 rs = ps.executeQuery();

                while(rs.next())
                {
                    nome= rs.getString("nomefuncionario");
                 
                }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Erro 1"+ex);
        }
        
        return nome;
    }

    public float getValor()
    {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   

}
    
    
    
        
    


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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ConexaoBD;
import view.Login;
import view.Menu;

public class Controle {
   
        Connection conexao = ConexaoBD.getConexao();
        
          String item;
            PreparedStatement pst, pstEmpresa, pstFuncionario, pstHolerite;

    public String getItem() {
        return item;
    }

    public void String(String item) {
        this.item = item;
    }
    
    public void SalvarUsuario(Usuario usuario){
        
        try {
             pst = conexao.prepareStatement("INSERT INTO usuario(login, senha) VALUES (?,?)");
            pst.setString(1, usuario.getUsuario());
            pst.setInt(2, usuario.getSenha());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cadastro efetuado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir"+ex);
        }
        
    }
    public boolean buscarUsuario(Usuario usuario)
    {
        
        String sql = "select * from usuario where login = ? and senha = ?";
        ResultSet rs;
        Login verificar;
        
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, usuario.getUsuario());
                pst.setInt(2, usuario.getSenha());
                rs = pst.executeQuery();
                               
                if(rs.next())
                {
                    if(rs.getString("").equals(usuario.getUsuario()) && rs.getInt("") == usuario.getSenha())
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                   
            }catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Erro!\n"+ex);
            }
            return false;
    }
    
    public void SalvarEmpresa(Empresa empresa)
    {
        try {
            pstEmpresa = conexao.prepareStatement("INSERT INTO empresa(cpnj, nome, endereco, telefone) VALUES (?,?,?,?)");
            pstEmpresa.setString(1,empresa.getCnpj());
            pstEmpresa.setString(2, empresa.getRazaoSocial());
            pstEmpresa.setString(3, empresa.getEndereco());
            pstEmpresa.setString(4, empresa.getTelefone());
            pstEmpresa.execute();
            JOptionPane.showMessageDialog(null,"Cadastro efetuado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir"+ex);
        }
    }
    
    public void SalvarFuncionario(Funcionario funcionario)
    {
        try {
             pstFuncionario = conexao.prepareStatement("INSERT INTO funcionario(cpf,nomefuncionario, idade, salario,cnpjempresa) VALUES (?,?,?,?,?)");
          
            pstFuncionario.setString(1, funcionario.getCpf());
            pstFuncionario.setString(2, funcionario.getNome());
            pstFuncionario.setInt(3, funcionario.getIdade());
            pstFuncionario.setFloat(4, funcionario.getSalario());
            pstFuncionario.setString(5, funcionario.getCnpjempresa());
            pstFuncionario.execute();
            JOptionPane.showMessageDialog(null,"Cadastro efetuado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir"+ex);
        }
        
    }
    
    public void SalvarHolerite(DadosHolerite holerite)
    {
        try {
             pstHolerite = conexao.prepareStatement("INSERT INTO holerite(cargahoraria, quantidadehoranoturna, horaextra, falta, nivelpericulosidade, nivelinsalubridade, diauteis, qtdfds,cpffuncionario) VALUES (?,?,?,?,?,?,?,?,?)");
            
            pstHolerite.setInt(1, holerite.getCargaHoraria());
            pstHolerite.setInt(2, holerite.getQtdeHoraNoturna());
            pstHolerite.setInt(3, holerite.getQtdeHoraExtra());
            pstHolerite.setInt(4, holerite.getQtdeFalta());
            pstHolerite.setInt(5, holerite.getNlPericulosidade());
            pstHolerite.setInt(6, holerite.getNlInsalubre());
            pstHolerite.setInt(7, holerite.getDiasuteis());
            pstHolerite.setInt(8, holerite.getQtdfds());
            pstHolerite.setString(9, holerite.getCpffuncionario());
            pstHolerite.execute();
            JOptionPane.showMessageDialog(null,"Cadastro efetuado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir"+ex);
        }
    }
      
   
}

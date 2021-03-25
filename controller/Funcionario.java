/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


/**
 *
 * @author User
 */
public class Funcionario   {
    protected String nome, cpf,cnpjempresa;
    protected int idade;
    protected float salario;
    
    public String getCnpjempresa() {
        return cnpjempresa;
    }

    public void setCnpjempresa(String cnpjempresa) {
        this.cnpjempresa = cnpjempresa;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    


    
    
}

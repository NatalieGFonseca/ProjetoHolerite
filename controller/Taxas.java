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

//INSS
public abstract class Taxas {
    Funcionario func;
    DadosHolerite nivel;
    protected float txInsalubridade;
    protected float hora_extra;
    protected float Coletar_FTGS ;
    protected float txINSS;
    protected float txIR;
    protected int nivelInsalubridade;
    
        
    public float calculoInsalubridade(){
    
                  
       
        nivelInsalubridade = nivel.nlInsalubre;
        
        if(nivelInsalubridade == 1){
            
            txInsalubridade =func.getSalario() *0.40f;            
        }
        else if(nivelInsalubridade== 2){
            
            txInsalubridade = func.getSalario()* 0.20f;
            
        }
        else if(nivelInsalubridade == 3){
            
            txInsalubridade = func.getSalario() * 0.10f;
            
        }
        
        return txInsalubridade;
        
    }
    
    public float calculoIR(){
        
        if(func.getSalario() <= 1903.98){
            
            txIR =  0;
            
        }
        
        else
            if(func.getSalario()>= 1903.99 && func.getSalario() <= 2826.65){
        
                txIR = (float) 0.075;
        
        }
            
        else
            if(func.getSalario() >=  2286.66 && func.getSalario() <= 3751.05){
             
                txIR =  (float) 0.15;
                
            }
            
        else
            if(func.getSalario() >= 3751.06 && func.getSalario() <= 4664.68){
                
                txIR =  (float) 0.225;
                
            }
        
        else
            if(func.getSalario() >= 4664.69){
                
                txIR = (float) 0.275;
                
            }
                
        
        return txIR;
        
    }
        
    public float calculoINSS(){

        if(func.getSalario() <= 1693.72){
            
            txINSS = (float) 0.08;
            
        }
        
        else
            if(func.getSalario() >= 1693.73 && func.getSalario() <= 2822.90){
                
                txINSS =  (float) 0.09;
                
            }
        
        else
            if(func.getSalario() >= 2822.91 && func.getSalario() <= 5645.80){
                
                txINSS =  (float) 0.11;
                
            }
            else
                if(func.getSalario() >= 5645.81){
                    
                    txINSS = (float) 621.04;//O teto máximo taxável é de 5645.81 apartir de então todos os salários vão descontar o valor fixo de 621.04 
                    
                }
        
        
        return txINSS;
        
    }

    
   
    
    
}


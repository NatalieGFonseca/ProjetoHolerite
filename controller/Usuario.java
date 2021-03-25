
package controller;

public class Usuario {
    private String usuario;
    private int senha;
    
    
    public static int verificaSenha(int senha)
    {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
}

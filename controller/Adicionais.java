
package controller;





public class Adicionais extends DadosHolerite {
    Taxas taxa;
    Funcionario func;
    private float adNoturno, adInsalubridade, horaextra, adicionalDsr,adicionalPericulosidade;
    
    public float adicionalNoturno(float quantidadehoranoturna)
    {
        
        this.adNoturno =(float) ((qtdeHoraNoturna*20)/100);
        
        
        return adNoturno;
    
    }
    
    public float insalubridade()
    {
        this.adInsalubridade = this.taxa.txInsalubridade;
        return adInsalubridade;
    }
    public float horaExtra(int horaextra)
    {
          this.horaextra = (float)((horaextra*50)/100);
          return horaextra;
    }
    
    public float dsr(int horaextra,int diauteis,int qtdfds,int cargahoraria)
    {   
       this.adicionalDsr = (float)(((horaextra/diauteis)*qtdfds)*cargaHoraria);
        return adicionalDsr;
    }
    
    public void periculosidade()
    {
        this.adicionalPericulosidade = (func.getSalario()*30)/100;     
    }

    public Taxas getTaxa() {
        return taxa;
    }

    public void setTaxa(Taxas taxa) {
        this.taxa = taxa;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public float getAdNoturno() {
        return adNoturno;
    }

    public void setAdNoturno(float adNoturno) {
        this.adNoturno = adNoturno;
    }

    public float getAdInsalubridade() {
        return adInsalubridade;
    }

    public void setAdInsalubridade(float adInsalubridade) {
        this.adInsalubridade = adInsalubridade;
    }

    public float getHoraextra() {
        return horaextra;
    }

    public void setHoraextra(float horaextra) {
        this.horaextra = horaextra;
    }

    public float getAdicionalDsr() {
        return adicionalDsr;
    }

    public void setAdicionalDsr(float adicionalDsr) {
        this.adicionalDsr = adicionalDsr;
    }

    public float getAdicionalPericulosidade() {
        return adicionalPericulosidade;
    }

    public void setAdicionalPericulosidade(float adicionalPericulosidade) {
        this.adicionalPericulosidade = adicionalPericulosidade;
    }
    
    
}

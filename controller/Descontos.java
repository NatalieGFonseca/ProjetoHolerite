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
public class Descontos extends Taxas{
  
    DadosHolerite holerite;
    private float fgts,inss, falta, vt, vr;

     public void coletar_fgts(float valor){
       this.fgts = (float) (valor * 0.08);
         }
     public void contibuir_inss(float valor){
      this.inss = (float) (valor* this.txINSS);
     }
     public void falta(float valor,int diafalta){
       this.falta =(float)((valor/30)*((float) diafalta));
    }
     
    public void vt(float valor){
        this.vt = (float) (valor* 0.06);
              
    }
    public void vr(float valor){
       this.vr = (float) (valor*0.2);
    }

    public DadosHolerite getHolerite() {
        return holerite;
    }

    public void setHolerite(DadosHolerite holerite) {
        this.holerite = holerite;
    }

    public float getFgts() {
        return fgts;
    }

    public void setFgts(float fgts) {
        this.fgts = fgts;
    }

    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        this.inss = inss;
    }

    public float getFalta() {
        return falta;
    }

    public void setFalta(float falta) {
        this.falta = falta;
    }

    public float getVt() {
        return vt;
    }

    public void setVt(float vt) {
        this.vt = vt;
    }

    public float getVr() {
        return vr;
    }

    public void setVr(float vr) {
        this.vr = vr;
    }
}

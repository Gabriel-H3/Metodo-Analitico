/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoanalitico;

/**
 *
 * @author gomes
 */
public class Analise {
    
    private String trueFalse;
    
    public Analise(){
    
    
    }
    
    public void CasoIeII(double x, double y){
     if(x>=0 && y>=0){
      System.out.println("Método Caso I e II é viável");
      trueFalse = "S";
     } else{
      System.out.println("Método Caso I e II não é viável");
      trueFalse = "N";
     }
    }
    
    public void CasoIeIII (double x,double y, double fornoPao, double fornoBolo, double limiteForno){
        
        double cal1 = fornoPao * x;
        double cal2 = fornoBolo * y;
        
        if(cal2 <= limiteForno && cal1>= 0){
         System.out.println("Método Caso I e III é viável");
         trueFalse = "S";
         } else{
         System.out.println("Método Caso I e III não é viável");
         trueFalse = "N";
         }
 
    }
    
     public void CasoIeIV (double x,double y, double fornoPao, double fornoBolo, double limiteForno){
        
        double cal1 = fornoBolo * y;
        double cal2= fornoPao * x;
        
        if(cal2 <= limiteForno && cal1 >= 0){
         System.out.println("Método Caso I e IV é viável");
         trueFalse = "S";
         } else{
         System.out.println("Método Caso I e IV não é viável");
         trueFalse = "N";
         }
    }
     
      public void CasoIIeIII (double x,double y, double trabalhoPao, double trabalhoBolo, double limiteTrabalho){
        
        double cal1 = trabalhoPao * x;
        double cal2 = trabalhoBolo * y;
        
        if(cal2 <= limiteTrabalho && cal1 >= 0){
         System.out.println("Método Caso II e III é viável");
         trueFalse = "S";
         } else{
         System.out.println("Método Caso II e III não é viável");
         trueFalse = "N";
         }
    }
      public void CasoIIeIV (double x,double y, double trabalhoPao, double trabalhoBolo, double limiteTrabalho){
        
        double cal1 = trabalhoBolo * x;
        double cal2 = trabalhoPao * y;
        
        if(cal2 <= limiteTrabalho && cal1 >= 0){
         System.out.println("Método Caso II e IV é viável");
         trueFalse = "S";
         } else{
         System.out.println("Método Caso II e IV não é viável");
         trueFalse = "N";
         }
    }
      public double Lucro(double x, double y, double lucroPao, double lucroBolo){
       double lucromax = (lucroPao * x) + (lucroBolo * y);
       return lucromax;
      }
      
       public String getTrueFalse() {
        return trueFalse;
    }

    public void setTrueFalse(String trueFalse) {
        this.trueFalse = trueFalse;
    }
    
}

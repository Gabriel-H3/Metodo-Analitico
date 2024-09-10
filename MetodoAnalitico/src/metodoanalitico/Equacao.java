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
public class Equacao {

    
    private double x, y;
    
    public Equacao(){
       
    }
    
    public void CasoIeII(double trabalhoPao, double trabalhoBolo, double fornoPao, double fornoBolo, double limiteTrabalho, double limiteForno){
        
        double delta = (trabalhoPao * fornoBolo) - (trabalhoBolo * fornoPao);
        double deltaX = (limiteTrabalho * fornoBolo) - (trabalhoBolo * limiteForno);
        double deltaY = (trabalhoPao * limiteForno) - (limiteTrabalho * fornoPao);
        
        
        if(delta != 0){
            x = deltaX/delta;
            y = deltaY/delta; 
        } else{
            y= -1;
            x= -1;
        }
            
    }
    
    public void CasoIeIII(double trabalhoBolo, double trabalhoPao, double limiteTrabalho){
        
        y = limiteTrabalho/trabalhoBolo;
        x = 0;
    }
    
    public void CasoIeIV(double trabalhoPao, double trabalhoBolo, double limiteTrabalho){
        
        x = limiteTrabalho/trabalhoPao;
        y = 0;
    }
    
     public void CasoIIeIII(double fornoBolo, double fornoPao, double limiteForno){
        
        y = limiteForno/fornoBolo;        
        x = 0;
        
    }
    
    public void CasoIIeIV(double fornoPao, double fornoBolo, double limiteForno){
      
        x = limiteForno/fornoPao;
        y = 0;
    }
    
        
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
        
    }
    


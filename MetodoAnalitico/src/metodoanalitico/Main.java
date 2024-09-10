/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoanalitico;

import java.util.Scanner;

/**
 *
 * @author gomes
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double trabalhoPao, trabalhoBolo, fornoPao, fornoBolo, lucroPao, lucroBolo, limiteTrabalho, limiteForno;
        Equacao equacao = new Equacao();
        Analise analise = new Analise();
        
        System.out.print("Digite o lucro por pão: ");
        lucroPao = sc.nextDouble();
        System.out.print("Digite o lucro por bolo: ");
        lucroBolo = sc.nextDouble();
        
         System.out.print("\n");
        
        System.out.print("Digite a quantidade de trabalho do pão: ");
        trabalhoPao = sc.nextDouble();
        System.out.print("Digite a quantidade de forno do pão: ");
        fornoPao = sc.nextDouble();
        System.out.print("Digite a quantidade de trabalho do bolo: ");
        trabalhoBolo = sc.nextDouble();
        System.out.print("Digite a quantidade de forno do bolo: ");
        fornoBolo = sc.nextDouble();
        
         System.out.print("\n");
         
        System.out.print("Digite a quantidade de horas de trabalho disposta: ");
        limiteTrabalho = sc.nextDouble();
        System.out.print("Digite a quantidade de horas de forno disposta: ");
        limiteForno = sc.nextDouble();
        
         System.out.print("\n");
        
        equacao.CasoIeII(trabalhoPao, trabalhoBolo, fornoPao, fornoBolo, limiteTrabalho, limiteForno);
        analise.CasoIeII(equacao.getX(), equacao.getY());
        String trueFalseA = analise.getTrueFalse();
        double lucroA = 0;
         if(trueFalseA.equals("S")){
           lucroA = analise.Lucro(equacao.getX(), equacao.getY(), lucroPao, lucroBolo);
        }
        
        equacao.CasoIeIII(trabalhoBolo, trabalhoPao, limiteTrabalho);
        analise.CasoIeIII(equacao.getX(), equacao.getY(), fornoPao, fornoBolo, limiteForno);
        String trueFalseB = analise.getTrueFalse();
        double lucroB = 0;
         if(trueFalseB.equals("S")){
           lucroB = analise.Lucro(equacao.getX(), equacao.getY(), lucroPao, lucroBolo);
        }
        
        equacao.CasoIeIV(trabalhoPao, trabalhoBolo, limiteTrabalho);
        analise.CasoIeIV(equacao.getX(), equacao.getY(), fornoPao, fornoBolo, limiteForno);
        String trueFalseC = analise.getTrueFalse();
        double lucroC = 0;
         if(trueFalseC.equals("S")){
           lucroC = analise.Lucro(equacao.getX(), equacao.getY(), lucroPao, lucroBolo);
        }
        
        equacao.CasoIIeIII(fornoBolo, fornoPao, limiteForno);
        analise.CasoIIeIII(equacao.getX(), equacao.getY(), trabalhoPao, trabalhoBolo, limiteTrabalho);
        String trueFalseD  = analise.getTrueFalse();
        double lucroD = 0;
         if(trueFalseD.equals("S")){
           lucroD = analise.Lucro(equacao.getX(), equacao.getY(), lucroPao, lucroBolo);
        }
        
        equacao.CasoIIeIV(fornoPao, fornoBolo, limiteForno);
        analise.CasoIIeIV(equacao.getX(), equacao.getY(), trabalhoPao, trabalhoBolo, limiteTrabalho);
        String trueFalseE  = analise.getTrueFalse();
        double lucroE = 0;
         if(trueFalseE.equals("S")){
           lucroE = analise.Lucro(equacao.getX(), equacao.getY(), lucroPao, lucroBolo);
        }
         
          System.out.print("\n");
          
        if(lucroA > lucroB && lucroA > lucroC && lucroA > lucroD && lucroA > lucroE){
         
         System.out.println("O método I e II tem o maior lucro, sendo ele: " + lucroA);
        
        } else if(lucroB > lucroA && lucroB > lucroC && lucroB > lucroD && lucroB > lucroE){
            
             System.out.println("O método I e III tem o maior lucro, sendo ele: " + lucroB);
             
        } else if(lucroC > lucroA && lucroC > lucroB && lucroC > lucroD && lucroC > lucroE){
            
             System.out.println("O método I e IV tem o maior lucro, sendo ele: " + lucroC);
             
        } else if(lucroD > lucroA && lucroD > lucroC && lucroD > lucroB && lucroD > lucroE){
            
             System.out.println("O método II e III tem o maior lucro, sendo ele: " + lucroD);
             
        } else{
        
            System.out.println("O método II e IV tem o maior lucro, sendo ele: " + lucroE);
            
        }
    
    }
    
}

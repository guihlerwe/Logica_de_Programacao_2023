/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estrutura_de_Decisao.Lista2;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio08 {
    public static void main (String [] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Quantas horas você trabalhou?");
        double hora = s.nextDouble ();
        System.out.println("Qual o valor dado por hora?");
        double valor = s.nextDouble();
        
        //aliquota do salario bruto

        double bruto = hora * valor;
        double inss = 0;
        

        if (bruto <= 911.70) {
        inss = (bruto*8)/100;;
        } else if (bruto <= 1519.50) {
        inss =(bruto*9)/100;
        }else if (bruto >= 3038.99) {
        inss = (bruto *11)/100;
        }else{
        inss = 334.29;}
    
        
//aliquota imposto de renda
        
        double rendaa=0; 
        double imposto = bruto - inss;
        
        if (rendaa <= 1.37281) {
            imposto = 0;
            }else if (rendaa <= 2.74325) {
            imposto = rendaa * 0.15;
        }else {
          imposto = 0.275;
            }
        
        System.out.println(bruto - inss - rendaa);
    }
  
    }
    
}

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
public class Exercicio10 {
    public static void main (String [] args) { 
       Scanner s = new Scanner (System.in);
        System.out.println("Qual o valor?");
        int valor = s.nextInt();
        int  resto = valor % 5;
        if (resto > 0) {
            System.out.println("valor inválido");
        } else{
            if (valor >=100) {
                int n100 = valor / 100;
                System.out.println("notas de 100: "+n100);
                valor = valor % 100;                
            } 
            if (valor >=50) {
                int n50 = valor / 50;
                System.out.println("notas de 50: "+n50);
                valor = valor % 50;  
                
            }if (valor >= 20) {
                int n20 = valor / 20;
                System.out.println("notas de 20: "+n20);
                valor = valor % 20;
            }if  (valor >=10) {
                int n10 = valor / 10;
                System.out.println("notas de 10: "+n10);
                valor = valor % 10;  
            }if (valor >=5) {
                int n5 = valor / 5;
                System.out.println("notas de 5: "+n5);
                valor = valor % 5;
                }
        }  
            
        }                                                                                                                                                                                                                                                         
        
        
    }

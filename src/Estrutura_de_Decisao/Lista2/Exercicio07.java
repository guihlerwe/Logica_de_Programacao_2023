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
public class Exercicio07 {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Qual o codigo do seu produto? :)");
        int cod = s.nextInt();
        
        if (cod == 1){
            System.out.println("Alimento não perecível");
        } else if (cod == 2 || cod == 3 || cod == 4 ) {
            System.out.println("Alimento perecível");
        }else if (cod == 5 || cod == 6) {
            System.out.println("Vestuário");
        }else if (cod == 7) {
            System.out.println("Higiene pessoal");
        }else if (cod == 8 || cod == 9) {
            System.out.println("Limpeza e utensílios domésticos");
        }else {
            System.out.println("inválido");
        }
            
    }
        
        
        
    }

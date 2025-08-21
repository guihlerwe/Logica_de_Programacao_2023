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
public class Exercicio04 {
    public static void main(String [] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Qual a cor do cd?");
        String cor = s.next();
        
        if (cor.equalsIgnoreCase("verde")){
            System.out.println("Voce gastara R$ 10,00");
        } else if (cor.equalsIgnoreCase("azul")) {
            System.out.println("Voce gastara R$ 20,00");
        } else if (cor.equalsIgnoreCase("Amarelo")) {
            System.out.println("Voce gastara R$ 30,00");
        } else if (cor.equalsIgnoreCase("Vermelho")) {
            System.out.println("Voce gastara R$ 40,00");
        } else {
            System.out.println("Essa cor nao e disponivel");
        }
        
        
        
    }
}

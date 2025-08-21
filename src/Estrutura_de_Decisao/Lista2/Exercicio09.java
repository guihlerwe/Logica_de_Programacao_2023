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
public class Exercicio09 {
    public static void main (String [] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("escreva suas 3 respectivamente notas");
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();
        
 //media
        double media = (nota1 + nota2 + nota3)/3;
//media de aprovamento
        double ma = nota1 +(nota2 * 2) + ( nota3 * 3 ) + media/7;
        if (ma >9.0){
            System.out.println("o conceito ´é a ,e esta aprovado");
        }else if (ma > 7.5) {
            System.out.println("o conceito ´é b ;e esta aprovado");
            }else if (ma >6.0){
            System.out.println("o conceito ´é c; e esta aprovado");
            }else if (ma > 4.0) {
            System.out.println("o conceito ´é d, e esta reprovado");
        } else {
            System.out.println("o conceito ´é e, e esta reprovado");
        }
}
    
}

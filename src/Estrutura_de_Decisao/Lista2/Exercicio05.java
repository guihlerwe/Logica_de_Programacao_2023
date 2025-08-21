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
public class Exercicio05 {
    public static void main(String [] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Qual o nome?");
        String nome = s.next();
        System.out.println("Primeira nota?");
        double primeiro = s.nextDouble();
        System.out.println("Segunda nota?");
        double segundo = s.nextDouble();
        System.out.println("Terceira nota?");
        double terceiro = s.nextDouble();
        System.out.println("numero de faltas");
        int faltas = s.nextInt();
        
        if(faltas >(80*0.25)){
            System.out.println("voce"+nome+" foi reprovado por falta");
        }else if ((primeiro+segundo+terceiro) /3 >=7.0) {
        System.out.println("Aprovado");
        }else{
            System.out.println("voce"+nome+" foi reprovado por nota");
        }
       
    }
}

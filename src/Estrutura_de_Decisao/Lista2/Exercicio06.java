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
public class Exercicio06 {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        System.out.println("qual o cod do produto?");
        int cod = s.nextInt();
        System.out.println("qual quantidade?");
        int qnt = s.nextInt();
        
        if (cod ==1){
            System.out.println("Informática para Concursos, o valor e de "+ (qnt* 125.48));
        }   else if  (cod ==2){
            System.out.println("Java como Programar, o valor e de "+ (qnt* 108.36));
            }else if  (cod ==3){
            System.out.println("Lógica de Programação, o valor e de "+ (qnt* 99.99));
            }else if  (cod ==4){
            System.out.println("Fundamentos de Programação, o valor e de "+ (qnt* 215.67));
            }
    }
    
}

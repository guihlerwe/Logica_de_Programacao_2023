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
public class Exercicio01 {
    public static void main (String [] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Qual o dia ?");
        int dia = s.nextInt();
        System.out.println("Qual o mês ?");
        int mes = s.nextInt();
        System.out.println("Qual o ano ?");
        int ano = s.nextInt();
        
        if (ano%4==0 || mes==1 || dia<31) {
            int pdia = dia+1;
        }else { 
            int pmes = mes +1;
        }
    }
    
}

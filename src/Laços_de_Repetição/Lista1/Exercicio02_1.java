/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laços_de_Repetição.Lista1;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio02_1 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double maior = 0;
        double menor = 0;
        char continua = 0;
        int repeticao = 0;
        
        do{
            System.out.println("informe o valor");
            double valor = s.nextDouble ();
            if (repeticao==0) {
                maior = valor;
                menor = valor;
            }else if (valor > maior) {
                maior = valor;
            }else{
                menor = valor;
            }
            repeticao++;

            System.out.println("deseja continuas Sim (s), Não(n);");
            continua = s.next().charAt(0);
            
            
        }while (continua=='s');
        
        System.out.println(maior);
        System.out.println(menor);
     }}

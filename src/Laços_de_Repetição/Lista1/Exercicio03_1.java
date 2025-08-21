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
public class Exercicio03_1 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe valor");
        int valor = s.nextInt ();
        
         
         for (int f = valor-1; f != 1; f--) {
             valor= valor*f;

        }
        System.out.println(valor);

    }
}


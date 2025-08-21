/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laços_de_Repetição.Lista2;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor = 1;
        while (valor > 0) {
            System.out.println("Qual o valor?");
            valor = s.nextInt();
            for (int i = 1; i < valor; i++) {
                if (valor % i == 0) {
                    System.out.println(i);
                }

            }
        }
    }
}

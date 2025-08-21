/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laços_de_Repetição.Lista3;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o valor?");
        int valor = s.nextInt();

        for (int cont = 1; cont <= valor; cont++) {
            for (int ss = 1; ss <= cont; ss++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }
}

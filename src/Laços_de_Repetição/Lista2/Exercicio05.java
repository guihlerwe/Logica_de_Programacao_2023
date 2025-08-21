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
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int numero = 1; numero <= 100; numero++) {
            if (numero == 1 || numero == 2 || numero == 3 || numero == 5 || numero == 7) {
                System.out.println(numero + " é primo");
            } else if (numero % 2 == 0) {
                System.out.println(numero + " não é primo");
            } else if (numero % 3 == 0) {
                System.out.println(numero + " não é primo");
            } else if (numero % 5 == 0) {
                System.out.println(numero + " não é primo");
            } else if (numero % 7 == 0) {
                System.out.println(numero + " não é primo");
            } else {
                System.out.println(numero + " é primo");
            }
        }

    }
}

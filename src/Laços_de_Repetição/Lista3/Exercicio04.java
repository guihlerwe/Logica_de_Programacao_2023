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
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        while (numero < 5 || numero > 15) {

            System.out.println("quantos # irá ter na pirâmide");
            numero = s.nextInt();
        }

        int espacos = numero / 2;

        for (int i = 1; i <= numero; i += 2) {

            for (int j = 1; j <= espacos; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
            espacos--;

        }

    }
}

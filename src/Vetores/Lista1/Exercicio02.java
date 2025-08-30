/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores.Lista1;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Qual o valor?");
            int valor = s.nextInt();

            if (valor % 2 == 0) {
                vetor[i] = 0;
            } else {
                vetor[i] = 1;
            }
        }
        for (int view = 0; view < vetor.length; view++) {
            System.out.println(vetor[view]);
        }

    }

}
}

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
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Qual o valor?");
            vetor[i] = s.nextInt();
        }

        for (int ss = 0; ss < vetor.length; ss++) {

            System.out.println(vetor[ss]);
        }

    }
}
}

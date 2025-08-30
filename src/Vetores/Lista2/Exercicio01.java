/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores.Lista2;

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

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Escolha um numero para deletar?");
        int num = s.nextInt();

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == num) {
                for (int i = j; i < vetor.length - 1; i++) {
                    vetor[i] = vetor[i + 1];
                }
                vetor[vetor.length - 1] = 0;
                break;
            }
        }
        System.out.printlnArraystoString(vetor));
    }

}
}

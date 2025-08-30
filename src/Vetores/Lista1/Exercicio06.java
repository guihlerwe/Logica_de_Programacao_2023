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
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Valor?");
            A[i] = s.nextInt();
        }

        for (int j = 0; j < B.length; j++) {
            if (j % 2 == 0) {
                B[j] = A[j] * 5;
            } else {
                B[j] = A[j] + 5;
            }
        }

        for (int k = 0; k < A.length; k++) {
            System.out.println(A[k]);
        }
        for (int l = 0; l < B.length; l++) {
            System.out.println(B[l]);
        }
    }
}
}

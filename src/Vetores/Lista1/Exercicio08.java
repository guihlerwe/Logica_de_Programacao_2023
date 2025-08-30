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
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A[] = new int[10];
        int B[] = new int[10];
        int x = A.length - 1;

        for (int i = 0; i < A.length; i++) {
            System.out.println("informe o valor de A");
            A[i] = s.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = A[x];
            x--;

        }
        for (int i = 0; i < A.length; i++) {
            System.out.println("a : " + A[i]);
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("b : " + B[i]);
        }
    }
}
}

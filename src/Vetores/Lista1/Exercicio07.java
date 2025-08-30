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
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A[] = new int[10];
        int B[] = new int[10];
        int base[] = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Qual o valor do array A no " + i + "º indice?");
            A[i] = s.nextInt();
            base[i] = A[i];
            System.out.println("Qual o valor do array B no " + i + "º indice?");
            B[i] = s.nextInt();

        }

        for (int r = 0; r < A.length; r++) {
            A[r] = B[r];
            B[r] = base[r];
        }

        for (int ver = 0; ver < A.length; ver++) {
            System.out.println("A no " + ver + " indice é" + A[ver]);
            System.out.println("B no " + ver + " indice é" + B[ver]);

        }

    }

}
}

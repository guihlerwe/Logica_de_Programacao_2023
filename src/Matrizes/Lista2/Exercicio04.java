/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes.Lista2;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio04 {

    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o valor de n e m:");
        int n = s.nextInt();
        int m = s.nextInt();

        int matriz[][] = new int[n][m];
        int vetor[] = new int[n + m];
        int x = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe o valor da matriz nA LINHA" + i + " e coluna " + j);
                matriz[i][j] = s.nextInt();

            }
        }
        for (int l = 0; l < matriz.length; l++) {
            for (int mm = 0; mm < matriz[l].length; mm++) {
                System.out.print(matriz[l][mm] + " ");
            }
            System.out.println(" ");
        }
    }
}
}

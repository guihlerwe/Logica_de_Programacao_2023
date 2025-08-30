/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes.Lista1;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio10 {

    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o valor de N e M?");
        int n = s.nextInt();
        int m = s.nextInt();

        int matriz[][] = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("informe o valor na linha " + i + ", coluna " + j);
                matriz[i][j] = s.nextInt();

            }

        }

        for (int i = 0; i < matriz.length; i++) {
            int maior = Integer.MIN_VALUE;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

            }
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.println(matriz[i][k] * maior);
            }

        }
    }
}
}

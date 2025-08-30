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
public class Exercicio02 {
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o valor de N e M respectivamente");
        int n = s.nextInt();
        int m = s.nextInt();

        int matriz[][] = new int[n][m];
        int vetorsoma[] = new int[n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe o valor na linha " + i + ", e coluna " + j + ":");
                matriz[i][j] = s.nextInt();
                vetorsoma[i] += matriz[i][j];

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = vetorsoma[i] * matriz[i][j];
                System.out.println("O valor da multiplicacao e " + matriz[i][j]);
            }
        }
    }
}
}

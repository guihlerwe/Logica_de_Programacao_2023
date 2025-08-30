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
public class Exercicio05 {
    
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe NxM");
        int n = s.nextInt();
        int m = s.nextInt();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int col = 0;
        int lin = 0;

        int matriz[][] = new int[n][m];

        String sela = "zero";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("informe o valor na lina " + i + " e coluna " + j + " :");
                matriz[i][j] = s.nextInt();

            }

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    col = j;
                }
            }
        }

        for (int j = 0; j < matriz.length; j++) {
            if (matriz[j][col] > maior) {
                maior = matriz[j][col];
                lin = j;
            }
        }
        if (menor == maior) {
            System.out.println("o elemento " + maior + " é ponto de sela, e éta na coluna " + col + " linha " + lin);
        }
    }
}
}

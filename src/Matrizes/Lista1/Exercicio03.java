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
public class Exercicio03 {
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o valor N");
        int n = s.nextInt();
        System.out.println("Informe o valor M");
        int m = s.nextInt();

        double matriz[][] = new double[n][m];
        double media = 0;
        int div=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("informe um valor para a linha " + i + ", na coluna " + j + ".");
                matriz[i][j] = s.nextDouble();
                if (i % 2 == 0) {
                    media += matriz[i][j];
                    div++;
                }

            }
        }

        System.out.println("A media dos elementos em linhas pares e de " + (media / div));
    }
}
}

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
public class Exercicio06 {
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        int m[][] = new int[2][2];
        int r[][] = new int[2][2];

        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Informe o valor na linha " + i + ", e coluna " + j);
                m[i][j] = s.nextInt();

                if (m[i][j] > maior) {
                    maior = m[i][j];
                }

            }
        }

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                r[i][j] = m[i][j] * maior;

            }

        }

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                System.out.println("R na linha: " + i + ", e coluna: " + j + ", e: " + r[i][j]);

            }

        }

    }
}
}

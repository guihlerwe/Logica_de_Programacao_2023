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
public class Exercicio07 {
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        int matriz1[][] = new int[3][2];
        int matriz2[][] = new int[3][2];
        int soma[][] = new int[3][2];
        int sub[][] = new int[3][2];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.println("Informe o valor da matriz1. linha: " + i + ", coluna: " + j);
                matriz1[i][j] = s.nextInt();
                System.out.println("Informe o valor da matriz2. linha: " + i + ", coluna: " + j);
                matriz2[i][j] = s.nextInt();

                soma[i][j] = matriz1[i][j] + matriz2[i][j];
                sub[i][j] = matriz1[i][j] - matriz2[i][j];
            }

        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("Soma na linha" + i + " e coluna" + j + " e de: " + soma[i][j]);
                System.out.println("Subtracao na linha" + i + " e coluna" + j + " e de: " + sub[i][j]);

            }

        }
    }
}
}

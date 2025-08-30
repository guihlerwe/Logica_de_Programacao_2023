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
public class Exercicio02 {
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o valor N");
        int n = s.nextInt();
        System.out.println("Informe o valor M");
        int m = s.nextInt();

        int entrequinzeevinte = 0;

        int matriz[][] = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe um valor para a linha " + i + ", na coluna " + j + ".");
                matriz[i][j] = s.nextInt();
                if (matriz[i][j] >= 15 && matriz[i][j] <= 20) {
                    entrequinzeevinte++;

                }
            }

        }
        System.out.println("A matriz contem " + entrequinzeevinte + ", numeros entre 15 e 20");

    }

}
}

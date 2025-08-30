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
public class Exercicio09 {
    
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o valor de N?");
        int n = s.nextInt();

        int matriz[][] = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("informe o valor");
                matriz[i][j] = s.nextInt();

            }

        }
        int i = 0;

        for (int h = 0; h < matriz.length; h++) {
            for (int j = 0; j < matriz[h].length; j++) {
                if (matriz[h][j] != matriz[j][h]) {
                    System.out.println("Não e simetrica");
                    i++;

                    break;
                }

            }
        }
        if (i == 0) {
            System.out.println("e simetrica");
        }

    }

}
}

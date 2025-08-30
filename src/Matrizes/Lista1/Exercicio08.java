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
public class Exercicio08 {
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        int matriz[][] = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe o valor na linha: " + i + ", e coluna: " + j);
                matriz[i][j] = s.nextInt();

            }

        }

        System.out.println("Qual numero voce deseja usar para multiplicar a matriz diagonalmente?");
        int multiplicador = s.nextInt();
        int x = 0;
        int y = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == x && j == y) {
                    matriz[i][j] = multiplicador * matriz[i][j];
                    x++;
                    y++;
                }
                System.out.println("A matriz na linha: " + i + ", e coluna: " + j + " e: " + matriz[i][j]);
            }
        }
    }
}
}

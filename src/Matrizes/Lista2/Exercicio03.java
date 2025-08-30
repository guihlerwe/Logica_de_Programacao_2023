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
public class Exercicio03 {
    
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);

        int vetory[] = new int[18];
        int matriz[][] = new int[3][6];
        int x = 0;

        for (int i = 0; i < vetory.length; i++) {
            System.out.println("informe o valor do vetor na posicao " + i + ":");
            vetory[i] = s.nextInt();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = vetory[x];
                x++;
                System.out.println("a matriz na linha " + i + ", e coluna " + j + ", e: " + matriz[i][j]);
            }
        }
    }
}
}

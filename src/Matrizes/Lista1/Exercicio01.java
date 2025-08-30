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
public class Exercicio01 {
    
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);

        int matriz[][] = new int[2][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe um valor para a linha " + i + ", na coluna " + j + ".");
                matriz[i][j] = s.nextInt();

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(" ");
        }

    }

}
}

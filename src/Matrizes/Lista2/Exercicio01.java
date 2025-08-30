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
public class Exercicio01 {
    
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);

        int matriz[][] = new int[5][5];
        int vetorlinha[] = new int[5];
        int vetorcoluna[] = new int[5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("informe o valor da matriz na linha " + i + ", e coluna " + j);
                matriz[i][j] = s.nextInt();
                vetorlinha[i] += matriz[i][j];
                vetorcoluna[j] += matriz[i][j];

            }
        }

        for (int i = 0; i < vetorlinha.length; i++) {
            System.out.println("esse são os valores da linha " + i + ": " + vetorlinha[i]);
        }

        for (int i = 0; i < vetorcoluna.length; i++) {
            System.out.println("esse são os valores da coluna " + i + ": " + vetorcoluna[i]);
        }
    }
}
}

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
public class Exercicio05 {
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        int matriz[][] = new int[4][4];
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        String maiorr = ("zero");
        String menorr = ("zero");
        int somalinha3 = 0;
        int somacoluna2 = 0;
        int media = 0;
        int somadiagonal = 0;
        int somamaiormedia = 0;
        int somamatriz = 0;

        int x = 0;
        int y = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe o valor da linha " + i + ", na coluna " + j + ".");
                matriz[i][j] = s.nextInt();

                somamatriz += matriz[i][j];
                media += matriz[i][j];

                if (i == x && j == y) {
                    somadiagonal += matriz[i][j];
                    x++;
                    y++;
                }

                if (i == 3) {
                    somalinha3 += matriz[i][j];
                }
                if (j == 2) {
                    somacoluna2 += matriz[i][j];
                }

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    maiorr = ("Linha" + i + ", na coluna " + j);
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    menorr = ("Linha" + i + ", na coluna " + j);
                }

            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > media / 16) {
                    somamaiormedia += matriz[i][j];
                }
            }
        }

        System.out.println("A soma da linha 3 e: " + somalinha3);
        System.out.println("A soma da coluna 2 e: " + somacoluna2);
        System.out.println("A média dos elementos da matriz e de " + (media / 16));
        System.out.println("O maior elemento e: " + maior + " e esta na " + maiorr);
        System.out.println("O menor elemento e: " + menor + " e esta na " + menorr);
        System.out.println("A soma da diagonal principal e de: " + somadiagonal);
        System.out.println("A soama dos elementos maior que a media e de: " + somamaiormedia);
        System.out.println("A soma de todos os elementos e de: " + somamatriz);
    }

}
}

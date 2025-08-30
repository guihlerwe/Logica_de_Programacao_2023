/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores.Lista2;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dois = 0;
        int tres = 0;

        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe os valores do vetor");
            vetor[i] = s.nextInt();

            if (vetor[i] % 2 == 0) {
                dois++;
            }

            if (vetor[i] % 3 == 0) {
                tres++;
            }

        }

        int d[] = new int[dois];
        int t[] = new int[tres];
        int x = 0;
        int z = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                d[x] = vetor[i];
                x++;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 3 == 0) {
                t[z] = vetor[i];
                z++;

            }
        }

        for (x = 0; x < d.length; x++) {
            for (z = 0; z < t.length; z++) {
                if (d[x] == t[z]) {
                    System.out.println(d[x]);
                }
            }
        }

    }
}


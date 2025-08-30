/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores.Lista1;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int notas[] = new int[9];
        int mediaturma = 0;
        int maiorquemedia = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota do aluno?");
            notas[i] = s.nextInt();

        }

        for (int mediageral = 0; mediageral < notas.length; mediageral++) {
            mediaturma += notas[mediageral];

        }
        mediaturma = mediaturma / 10;

        for (int maior = 0; maior < notas.length; maior++) {
            if (notas[maior] > mediaturma) {
                maiorquemedia++;
            }
        }

        System.out.println("a media da turma é " + mediaturma);
        System.out.println("e" + maiorquemedia + " tiveram media maior que a geral da turma");
    }
}
}

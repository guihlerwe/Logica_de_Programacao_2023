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
public class ex10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int megasena[] = new int[6];
        int aposta[] = new int[10];
        int ponto = 0;

        for (int i = 0; i < megasena.length; i++) {
            System.out.println("Informe o " + i + " número?");
            megasena[i] = s.nextInt();
        }

        for (int j = 0; j < aposta.length; j++) {
            System.out.println("Qual o " + j + " número?");
            aposta[j] = s.nextInt();
        }

        for (int k = 0; k < megasena.length; k++) {
            if (aposta[k] == megasena[k]) {
                ponto++;
            }
        }

        System.out.println("Você fez " + ponto + " pontos!");
    }
}

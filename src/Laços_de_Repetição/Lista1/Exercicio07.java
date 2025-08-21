/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laços_de_Repetição.Lista1;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menor = 1000;
        int maior = 0;
        int nantigo = 0;
        int nrecente = 0;
        char continua = 0;

        do {

            System.out.println("Qual o numero do trabalhador?");
            int numero = s.nextInt();
            System.out.println("Quantos meses trabalhados?");
            int meses = s.nextInt();

            if (meses > maior) {
                maior = meses;
                nrecente = numero;
            }

            if (meses < maior) {
                menor = meses;
                nantigo = numero;

            }

            System.out.println("continuar?");
            continua = s.next().charAt(0);

        } while (continua == 's');

        System.out.println(nantigo);
        System.out.println(nrecente);
    }
}

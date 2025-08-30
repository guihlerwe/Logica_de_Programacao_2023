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
public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int vetor[] = new int[5];
        int maior = int.MIN_VALUE;
        int imaior = 0;
        int menor = Integer.MAX_VALUE;
        int imenor = 0;

        for (int entrada = 0; entrada < vetor.length; entrada++) {
            System.out.println("Informe o valor?");
            int valor = s.nextInt();
            vetor[entrada] = valor;

            if (valor > maior) {
                maior = valor;
                imaior = entrada;
            }

            if (valor < menor) {
                menor = valor;
                imenor = entrada;

            }

        }

        System.out.println("o maior valor é:" + maior + ", e seu indice é " + imaior + " o menor valor é:" + menor + ", e seu indice é" + imenor);

    }

}
}

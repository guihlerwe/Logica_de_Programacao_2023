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
public class Exercicio09 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double A[] = new double[7];
        double mtempo = 0;
        double media = 0;
        int tentativa = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Qual foi o tempo médio da " + i + " volta?");
            A[i] = s.nextInt();
            media += A[i];
            if (A[i] > mtempo) {
                mtempo = A[i];
                tentativa = i;
            }

        }
        System.out.println("O tempo médio do piloto foi de" + (media / 7));
        System.out.println("O melhor tempo do piloto foi na " + tentativa + "º tentativa, com um tempo de " + mtempo);
    }

}
}

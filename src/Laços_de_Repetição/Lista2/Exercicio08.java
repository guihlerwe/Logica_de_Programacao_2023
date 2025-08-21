/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laços_de_Repetição.Lista2;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor;

        do {
            System.out.println("Qual o valor?");
            valor = s.nextInt();
        } while (valor < 5 || valor > 10);

        while (valor < 100) {
            System.out.println(valor);
            valor = valor * 3;
        }

        // Imprimir o último valor (que é maior ou igual a 100)
        System.out.println(valor);
    }
}

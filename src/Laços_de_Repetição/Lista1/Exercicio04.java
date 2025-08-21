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
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o valor");
        int valor = s.nextInt();
        for (int fatorial = valor - 1; fatorial != 1; fatorial--) {
            valor = valor * fatorial;
        }
        System.out.println(valor);
    }
}

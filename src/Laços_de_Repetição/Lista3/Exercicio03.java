/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laços_de_Repetição.Lista3;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = s.nextInt();

        for (int i = 1; i <= numero; i++) {
            String linha = "";
            for (int j = 1; j <= i; j++) {
                int valor = i * j;
                linha += valor + " ";
            }
            System.out.println(linha);
        }
    }
}

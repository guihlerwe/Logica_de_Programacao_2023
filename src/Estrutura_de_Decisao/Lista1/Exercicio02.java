/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estrutura_de_Decisao.Lista1;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o preço?");
        double preco = s.nextDouble();
        System.out.println("Qual o código?");
        double cod = s.nextDouble();
        System.out.println(preco);
        if (cod == 1) {
            System.out.println("Sul");
        } else if (cod == 2) {
            System.out.println("Sudeste");
        } else if (cod == 3) {
            System.out.println("Centro-Oeste");
        } else if (cod == 4) {
            System.out.println("Norte");
        } else if (cod == 5) {
            System.out.println("Nordeste");
        }
    }
}


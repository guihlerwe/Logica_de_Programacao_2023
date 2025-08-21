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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual é o primeiro número?");
        double primeiro = s.nextDouble();
        System.out.println("Qual é o segundo número?");
        double segundo = s.nextDouble();
        System.out.println("Qual é o terceiro número?");
        double terceiro = s.nextDouble();
        if (primeiro > segundo && primeiro > terceiro) {
            System.out.println("O primeiro número é o maior.");
        } else if (segundo > primeiro && segundo > terceiro) {
            System.out.println("O segundo número é o maior.");
        } else if (terceiro > primeiro && terceiro > segundo) {
            System.out.println("O terceiro número é o maior.");
        }
    }
}


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
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o 1° lado do triângulo?");
        double primeiro = s.nextDouble();
        System.out.println("Qual o 2° lado do triângulo?");
        double segundo = s.nextDouble();
        System.out.println("Qual o 3° lado do triângulo?");
        double terceiro = s.nextDouble();
        if (primeiro == segundo && primeiro == terceiro && segundo == terceiro) {
            System.out.println("Equilátero");
        } else if (primeiro == segundo || primeiro == terceiro || segundo == terceiro) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
    }
}


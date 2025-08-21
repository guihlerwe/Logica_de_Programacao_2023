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
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o número?");
        double numero = s.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("O número é par e");
        } else {
            System.out.println("ímpar e");
        }

        if (numero > 0) {
            System.out.println("positivo");
        } else {
            System.out.println("negativo");
        }
    }
}


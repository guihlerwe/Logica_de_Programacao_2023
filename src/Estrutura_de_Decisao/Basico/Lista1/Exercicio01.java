/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estrutura_de_Decisao.Basico.Lista1;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe sua altura.");
        double altura = s.nextDouble();

        System.out.println("Informe seu sexo.");
        char sexo = s.next().charAt(0);

        if (sexo == 'M') {
            double mulher = (62.1 * altura) - 44.72;
            System.out.println(mulher);
        }
        if (sexo == 'H') {
            double homem = (72.7 * altura) - 58.0;
            System.out.println(homem);
        }
    }
}


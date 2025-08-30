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
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] salario = new double[10];
        for (int i = 0; i < salario.length; i++) {
            System.out.println("Qual o seu salário?");
            salario[i] = s.nextDouble();
            System.out.println("Qual o percentual de aumento?");
            double percentual = s.nextInt();
            salario[i] += (percentual / 100.0) * salario[i];
        }
        for (int j = 0; j < salario.length; j++) {
            System.out.println(salario[j]);
        }
    }
}
}

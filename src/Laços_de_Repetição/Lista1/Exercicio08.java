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
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double menorAltura = 3;
        double maiorAltura = 0;
        double mediaF = 0;
        double quantF = 0;
        double somaF = 0;
        double quantM = 0;
        char sexo = 0;
        char sexoMaior = 0;
        for (int rep = 1; rep <= 3; rep++) {
            System.out.println("Informe a altura");
            double altura = s.nextDouble();
            System.out.println("Informe o sexo");
            sexo = s.next().charAt(0);
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (sexo == 'f') {
                quantF++;
                somaF = somaF + altura;
            } else {
                quantM++;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
                sexoMaior = sexo;
            }
        }
        mediaF = somaF / quantF;
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura das mulheres: " + mediaF);
        System.out.println("Número de homens: " + quantM);
        System.out.println("Sexo da pessoa mais alta: " + sexoMaior);
    }
}

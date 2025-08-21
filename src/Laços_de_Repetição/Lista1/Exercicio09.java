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
public class Exercicio09 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double mediasalarial = 0;
        double mediafilhos = 0;
        double maiorsalario = 0;
        double percentual = 0;
        char continuee = 0;
        int pessoa = 0;
        int filho = 0;

        while (continuee == 's') {
            pessoa++;
            System.out.println("Qual seu saláiro?");
            double salarial = s.nextDouble();
            mediasalarial = salarial + mediasalarial;

            if (salarial <= 2500) {
                percentual++;
            }
            if (salarial > maiorsalario) {
                maiorsalario = salarial;
            }

            System.out.println("Quantos filhos você tem");
            filho = s.nextInt();

        }

        System.out.println("o maior salario é" + (maiorsalario));
        System.out.println("o percentual de pessoas que tem salario até 2500" + (percentual / pessoa));
    }

}

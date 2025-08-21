/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laços_de_Repetição.Lista2;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double segunda = 0;
        double terça = 0;
        double quarta = 0;
        double quinta = 0;
        double sexta = 0;
        double sabado = 0;
        double total = 0;
        char continuar = 0;

        do {
            System.out.println("Quantos R$ de pães e broas voce vendeu respectivamente de seg. a sab.?");
            segunda = s.nextDouble();
            terça = s.nextDouble();
            quarta = s.nextDouble();
            quinta = s.nextDouble();
            sexta = s.nextDouble();
            sabado = s.nextDouble();

            System.out.println("continuar?");
            continuar = s.next().charAt(0);

        } while (continuar == 's');

        total = segunda + terça + quarta + quinta + sexta + sabado;
        System.out.println("voce recebeu no total " + total + ",e os 10% sao" + (total * 0.10));

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estrutura_de_Decisao.Basico;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe o valor de A");
        int A = s.nextInt();
        System.out.println("informe valor B?");
        int B = s.nextInt();
        System.out.println("informe valor C?");
        int C = s.nextInt();
        int R = (A + B) * (A + B);
        int S1 = (B + C) * (B + C);
        int D = (R + S1) / 2;
        System.out.println(D);

    }

}

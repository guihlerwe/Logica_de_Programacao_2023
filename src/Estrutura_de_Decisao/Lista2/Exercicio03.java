/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estrutura_de_Decisao.Lista2;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio03 {
    public static void main(String [] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("qual o numero A?");
        int A = s.nextInt();
        System.out.println("qual o numero B?");
        int B = s.nextInt();
        if (A % B == 0) {
            System.out.println("é divisivel.");
        } else {
            System.out.println("não divisivel?.");
        }
    }
}

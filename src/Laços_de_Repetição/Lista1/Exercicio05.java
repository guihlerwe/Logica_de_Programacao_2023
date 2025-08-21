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
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int j = 1; j <= 5; j++) {
            System.out.println("qual o valor de a?");
            int a = s.nextInt();
            System.out.println("qual o valor de b?");
            int b = s.nextInt();

            for (int x = a; x <= b; x++) {
                if (x % 2 == 0) {
                    System.out.println(x);
                }
            }
        }
    }
}

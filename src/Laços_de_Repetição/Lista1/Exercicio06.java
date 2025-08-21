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
public class Exercicio06 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("x?");
        int x = s.nextInt();
        System.out.println("y?");
        int y = s.nextInt();
        int a = x;

        for (int b = 1; b < y; b++) {
            x = x * a;
        }
        System.out.println(x);
    }
}

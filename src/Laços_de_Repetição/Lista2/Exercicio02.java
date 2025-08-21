/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laços_de_Repetição.Lista2;

/**
 *
 * @author guilherme
 */
public class Exercicio02 {

    public static void main(String[] args) {
        int x = 1;

        do {
            for (int z = 1; z <= 10; z++) {
                System.out.println(z * x);
            }

            x++;
        } while (x <= 9);
    }
}

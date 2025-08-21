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
public class Exercicio06 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int numero = 1; numero<=100; numero++){
           int primo = 1;
            for(int i = 2; i < numero; i++){
                if(numero % i == 0){
                    primo = 0;
                    break;
                }
            }
            if(primo == 1){
                System.out.println(numero);
            }
        }
        
    }
}

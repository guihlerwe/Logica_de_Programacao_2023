/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estrutura_de_Decisao.Lista1;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio03 {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Qual a sua idade? ^_^ ");
        int idade = s.nextInt();
        if (idade >=5 && idade <=7) {
            System.out.println("Infantil");
        }
        else if (idade >=11 && idade <=13) {
            System.out.println("Juvenil");
        }
        else if (idade >=18 && idade <=25) {
            System.out.println("Adulto");
        }
        System.out.println("Não se classifica UnU");
    }
}


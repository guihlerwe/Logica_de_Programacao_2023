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
public class Exercicio02 {
    public static void main(String [] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Qual o combustivel sendo utilizado? G ou E");
        char gasolina = s.next().charAt(0);
        System.out.println("Quantos litros serão usados?");
        double litro = s.nextDouble();
        
        if (gasolina == 'G' ) {
            double custo1 = litro * 3.34;
            System.out.println("voce gastara"+custo1);
        } else if (gasolina == 'E') {
        double custo2 = litro * 7.79;
            System.out.println("voce gastara "+custo2);
    }
    }
}

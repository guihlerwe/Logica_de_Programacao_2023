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
public class Exercicio11 {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu salario atual?");
        double salario = s.nextDouble();
        System.out.println("Qual percentual do reajuste?");
        double reajuste = s.nextDouble();
        double calculo = salario + (salario * (reajuste/100));
        System.out.println("seu reajuste e de"+calculo+".");
       
        
    }
}

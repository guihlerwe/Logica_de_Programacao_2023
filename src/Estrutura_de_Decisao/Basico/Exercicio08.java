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
public class Exercicio08 {
    public static void main (String args []) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o seu salário base?");
        double salr = s.nextDouble();
        System.out.println("Quantos depentendes tem ao seu salario base");
        double dep = s.nextDouble();
        double imp = 0.85 * salr;
        double gra = dep * 50.0;
        double fim = imp - gra;
        System.out.println("seu salario liquido é de "+fim+".");
        
               
    }
}

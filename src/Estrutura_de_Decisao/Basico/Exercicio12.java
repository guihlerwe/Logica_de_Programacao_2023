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
public class Exercicio12 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu salario fixo?");
        double fixo = s.nextDouble();
        System.out.println("Qual a comissao por carro vendido?");
        double comissao = s.nextDouble();
        System.out.println("Quantos carros voce vendeu?");
        double quantidade = s.nextDouble();
        System.out.println("Qual o valor total de carros que voce vendeu?");
        double valor = s.nextDouble();
        
        double salario1 = fixo * 0.05;
        double carros = salario1 * quantidade;
        double porcento = comissao * valor;
        double fim = fixo + carros + porcento;

        System.out.println("seu salario é de" + fim + " reais.");
    }
}

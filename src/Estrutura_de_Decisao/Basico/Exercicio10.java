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
public class Exercicio10 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Quantas horas o pedreiro irá trabalhar?");
        double pedreiro = s.nextDouble();
        System.out.println("Quantas horas o pintor trabalhara?");
        double pintor = s.nextDouble();
        double pevalor = pedreiro * 10.00;
        double pivalor = pintor * 8.00;
        double valor = pevalor + pivalor;
        System.out.println("voce ira gastar " + valor + " reais");
    }

}

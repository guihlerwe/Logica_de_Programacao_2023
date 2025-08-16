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
public class Exercicio09 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Quantas horas tera a viagem?");
        double horas = s.nextDouble();
        System.out.println("Qual a velocidade media por hora?");
        double velo = s.nextDouble();
        System.out.println("Quantos litros em media e gasto por quilometros?");
        double litros = s.nextDouble();
        System.out.println("Quantos reais e o litro da gasolina?");
        double preço = s.nextDouble();
        
        double distancia = horas * velo;
        double litro2 = distancia/litros;
        double preço2 = litro2 * preço;
        
        System.out.println("Voce irá gastar " + preço2 + " reais.");
    }

}

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
public class Exercicio07 {
    public static void main (String args []) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe a largura da parede");
        double largura = s.nextDouble ();
        System.out.println("informe a altura da parede");
        double altura = s.nextDouble ();
        System.out.println("Qual o rendimento da tinta em metros quadrados por litro?");
        double rendimento = s.nextDouble();
        System.out.println("quantos litros são?");
        double litros = s.nextDouble();
        System.out.println("qual o preço da lata?");
        double preço = s.nextDouble();
        double areap = largura * altura;
        double litros2 = areap/rendimento;
        double latas = litros/rendimento;
        double valor =  latas * preço;
        System.out.println("a area da parede é"+areap+"e sera usado"+latas+"latas, você gastara"+valor);
        
        
    }
    
}

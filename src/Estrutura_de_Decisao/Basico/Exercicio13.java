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
public class Exercicio13 {
    public static void main (String arg []){
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o numero total de votantes?");
        double votantes = s.nextDouble ();
        System.out.println("Qual o numero total de votos brancos?");
        double brancos = s.nextDouble ();
        System.out.println("Qual o numero total de votos nulos?");
        double nulos = s.nextDouble ();
        System.out.println("Qual o numero total de votos validos?");
        double validos = s.nextDouble ();
        
        double percentagemb = (brancos * 100.0) / votantes;
        double percentagemn = (nulos * 100.0) / votantes;
        double percentagemv = (validos * 100.0) / votantes;
        
        System.out.println("brancos="+ percentagemb + "nulos="+ percentagemn +"validos="+ percentagemv + " . ");
    }
    
}

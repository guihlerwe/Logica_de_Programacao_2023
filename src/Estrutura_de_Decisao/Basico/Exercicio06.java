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
public class Exercicio06 {
    public static void main (String args []) {
        Scanner s = new Scanner (System.in);
        System.out.println(" informar a quantidade de cabeça de gados");
        int gado = s.nextInt ();
        System.out.println (" informar a quantidade de herdeiros");
        int herdeiros = s.nextInt ();
        int distribuição = (int)(0.85+gado);
        int cadaherdeiro = distribuição/herdeiros;
        int resto = distribuição%herdeiros;
        System.out.println("Cada herdeiro recebera" +cadaherdeiro+" e sobrara(ão)+resto)" );
       
        
    }
    
}

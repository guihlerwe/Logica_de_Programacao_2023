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
public class Exercicio04 {

    public static void mains(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o custo e fábrica?");
        double Custofab = s.nextDouble();
        double Dis = (28 / 100.0) * Custofab;
        double impost = (45 / 100.0)* Custofab;
        double disimp = Dis + impost;
        
        System.out.println(disimp);
        

    }

}

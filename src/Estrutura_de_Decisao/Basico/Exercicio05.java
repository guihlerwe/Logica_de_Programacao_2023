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
public class Exercicio05 {

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual a altura do muro?");
        double al = s.nextDouble();
        System.out.println("Qual o comprimento do muro?");
        double cm = s.nextDouble();
        System.out.println("Qual a altura do tijolo?");
        double altt = s.nextDouble();
        System.out.println("Qual o comprimento do tijolo?");
        double cmt = s.nextDouble();
        System.out.println("Qual o valor do tijolo?");
        double vlt = s.nextDouble();
        double areamuro = al * cm;
        double areatijolo = altt * cmt;
        double tijolos = areatijolo / areamuro;
        System.out.println("A quantidade de tijolos é " + tijolos + "e o custo é de" + (tijolos * vlt));

    }
}

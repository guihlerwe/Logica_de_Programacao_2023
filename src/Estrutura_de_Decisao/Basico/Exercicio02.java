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
public class Exercicio02 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Quantos ANOS de vida você tem?");
        int ANOS = s.nextInt();
        System.out.println("Quantos MESES de vida você tem?");
        int MESES = s.nextInt();
        System.out.println("Quantos DIAS de vida você tem?");
        int DIAS = s.nextInt();
        int IDADE1 = ANOS * 365;
        int IDADE2 = MESES + IDADE1;
        int IDADE3 = IDADE2 + DIAS;
        System.out.println(IDADE3);

    }
}

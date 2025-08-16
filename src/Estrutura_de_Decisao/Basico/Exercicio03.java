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
public class Exercicio03 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe quantos dias de vida você tem?");
        int DIAS = s.nextInt();
        int ANOS = DIAS / 365;
        int RESTOANOS = DIAS % 365;
        int MESES = RESTOANOS / 30;
        int DIAS2 = RESTOANOS % 30;
        System.out.println(ANOS + "-" + MESES + "-" + DIAS2);
    }


}

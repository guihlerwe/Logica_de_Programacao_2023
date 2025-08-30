
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guilherme
 */
public class notas {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int matriz[][] = new int[32][3];
        String vetor[] = new String[32];
        int media[] = new int[32];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("qual seu nome?");
            vetor[i] = s.next();
            for (int k = 0; k < matriz[j].length; k++) {
                System.out.println("informe a nota de " + vetor[j] + ", no " + k + 1 + " trimestre.");
                matriz[i][k] = s.nextInt();
                media[i] += matriz[i][k];
            }
        }

        for (int i = 0; i < media.length; i++) {
            media[i] = media[i] / 3;

        }

        for (int j = 0; j < matriz.length; j++) {
            System.out.println("A nota de " + vetor[j] + ":");
            for (int k = 0; k < matriz[j].length; k++) {

                System.out.println(" no " + k + " trimestre é " + matriz[j][k]);

            }
            if (media[j] > 6) {
                System.out.println("aprovado");
            } else {

                System.out.println("reprovado");
            }

        }
    }
}

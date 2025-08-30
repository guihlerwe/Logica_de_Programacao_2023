/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class diagonalsecundaria {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("tamanho da linha e coluna respectivamente quadrada");
        int l = s.nextInt();
        int c = s.nextInt();
        int matriz[][] = new int[l][c];
        int somad = calcularsomadiagonalsecundaria(matriz);
        int media = mediaabaixodiagprincipal(matriz);
        boolean indentidade = matrizidentidade(matriz);
        if (l == 2){
            int determinante = determinante (matriz);
        }

    }

    public static int calcularsomadiagonalsecundaria(int m[][]) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j == m.length - 1) {
                    soma += m[i][j];
                }

            }

        }
        return soma;
    }

    public static int mediaabaixodiagprincipal(int m[][]) {
        int media = 0;
        int soma = 0;
        int quantidade = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i > j) {
                    soma += m[i][j];
                    quantidade++;
                }
            }
        }
        media = soma / quantidade;
        return media;
    }

    public static boolean matrizidentidade(int m[][]) {
        boolean verdadeiro = true;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    if (m[i][j] != 1) {
                        verdadeiro = false;
                    }
                } else {
                    if (m[i][j] != 0) {
                        verdadeiro = false;
                    }

                }
            }
        }
        return verdadeiro;
    }

    public static int determinante(int m[][]) {
        
            int diap = m [1][1] * m[0][0];
            int dias =m[1][0] *m[0][1];
        
        int produto  = diap - dias;
        return produto;
    }
    
    public static int transposta (int m[][]){
      for (int l = 0; l < m.length; l++) {
            for (int mm = 0; mm < m[l].length; mm++) {
                System.out.print(m[l][mm]+" ");
            }
            System.out.println(" ");
        }
      return 
    }
}



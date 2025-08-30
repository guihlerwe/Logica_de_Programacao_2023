/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes.Lista1;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio04 {
    
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe um valor para a linha"+i+", e coluna"+j+".");
                matriz[i][j] = s.nextInt();
                
            }
            
            

        }
        
        System.out.println("Informe o valor para comparação");
        int valor =s.nextInt();
        int comp=0;

        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j]==valor){
                    comp++;
                    break;
                }
            }
        }
        if(comp==1){
            System.out.println("Existe o valor");
        }else{
            System.out.println("Nao");
        }
    }
}
}

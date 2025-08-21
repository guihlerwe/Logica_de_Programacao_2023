/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laços_de_Repetição.Lista1;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Exercicio10 {
    public static void main (String args []){
        Scanner s = new Scanner (System.in);
        
        int aluno = 1;
        double altura = 0;
        
        double maioraltura=0;
        double menoraltura=Double.MAX_VALUE;
        int alunomaior =0;
        int alunomenor = 0;
        
        for (aluno=1; aluno <=10; aluno++){
            System.out.println("Qual sua altura?");
            altura = s.nextDouble();
            
            if (altura>maioraltura){
                maioraltura=altura;
                alunomaior=aluno;
            }
            if (altura<menoraltura){
                menoraltura=altura;
                alunomenor=aluno;
            }
        }
        System.out.println("o aluno "+alunomaior+" tem a maior altura de"+ maioraltura);
        System.out.println("o aluno "+alunomenor+" tem a menor altura de"+ menoraltura);
    }
}

/**
 * Implemente um programa que receba um número de 1 a 7 e imprime o dia da semana correspondente;
 * 
 * @author Antonio Lacerda;
 * @version 1.0;
 */

import java.util.Scanner;

public class BMQuestao05 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int num;

        System.out.print("Digite um número de 1 a 7: ");
        num = leitura.nextInt();

        switch(num){
            case 1:
                System.out.println("O dia escolhido foi Segunda-Feira.");
                break;
            case 2:
                System.out.println("O dia escolhido foi Terça-Feira.");
                break;
            case 3:
                System.out.println("O dia escolhido foi Quarta-Feira.");
                break;
            case 4:
                System.out.println("O dia escolhido foi Quinta-Feira.");
                break;
            case 5:
                System.out.println("O dia escolhido foi Sexta-Feira.");
                break;
            case 6:
                System.out.println("O dia escolhido foi Sábado.");
                break;
            case 7:
                System.out.println("O dia escolhido foi Domingo.");
                break;
            default:
                System.out.println("Entrada incorreta, tente novamente!");
        }
    }
}
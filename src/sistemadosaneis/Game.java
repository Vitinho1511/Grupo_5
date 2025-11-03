/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadosaneis;

import java.util.Scanner;

/**
 *
 * @author antonio.acoliveira
 */
public class Game {
    public void showMenu(String gameName) {
        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("\t" + gameName + "\n");

        do {                
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            
            System.out.print("\nEscolha uma opção: ");
            option = input.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Instruções...");
                    break;
                case 2:
                    System.out.println("Jogar...");
                    break;
                case 3:
                    System.out.println("Créditos...");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 4);

        input.close();
    }
}

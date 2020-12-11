package main;

import states.Mario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Super Mario Gambis!");

        Scanner in = new Scanner(System.in);
        Mario mario = new Mario();

        showMenu();

        int choice = in.nextInt();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    mario.takeMushroom();
                    break;
                case 2:
                    mario.takeFlower();
                    break;
                case 3:
                    mario.takeFeather();
                    break;
                case 4:
                    mario.takeYoshi();
                    break;
                case 5:
                    mario.takeDamage();
                    break;
                case 6:
                    mario = new Mario();
                    System.out.println("Bem vindo ao Super Mario Gambis!");
                    break;
                default:
                    System.out.println("Escolha uma opção válida!!");
                    break;

            }
            showMenu();
            choice = in.nextInt();
        }
        System.out.println("Até a próxima, meo brada!");
        System.exit(0);

    }

    private static void showMenu() {
        System.out.println();
        System.out.println("Escolha uma das opções abaixo: \n");
        System.out.println("1. Pegar cogumelo. ");
        System.out.println("2. Pegar Flor.");
        System.out.println("3. Pegar Pena.");
        System.out.println("4. Montar em Yoshi.");
        System.out.println("5. Tomar dano.");
        System.out.println("6. Reiniciar.");
        System.out.println("0. Sair");
        System.out.println();
    }
}

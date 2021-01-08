package main;

import java.util.Scanner;
import states.Mario;
import memento.Caretaker;	

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Super Mario Gambis!");

        Scanner in = new Scanner(System.in);        
        
        Caretaker caretaker = new Caretaker(new Mario());
        Mario mario = caretaker.getOriginador();
        caretaker.save();
        
        showMenu();

        int choice = in.nextInt();

        while (choice != 0) {

            switch (choice) {
	            case -1:
	            	mario.showState();
	                break;
                case 1:
                	mario.takeMushroom();
                    caretaker.save();
                    break;
                case 2:
                    mario.takeFlower();
                    caretaker.save();
                    break;
                case 3:
                    mario.takeFeather();
                    caretaker.save();
                    break;
                case 4:
                    mario.takeYoshi();
                    caretaker.save();
                    break;
                case 5:
                    mario.takeDamage();
                    caretaker.save();
                    break;
                case 6:                    
                	caretaker.undo();
                    break;
                case 7:                    
                    System.out.println("Carregando Jogo...");
                    caretaker.loadGame();
                    break;
                case 8:                    
                    System.out.println("Salvando Jogo...");
                    caretaker.saveGame();
                    break;
                case 9:
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
        in.close();
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
        System.out.println("6. Desfazer.");
        System.out.println("7. Carregar Jogo.");
        System.out.println("8. Salvar Jogo.");
        System.out.println("9. Reiniciar.");
        System.out.println("0. Sair");
        System.out.println("-1. Mostrar state ");
        System.out.println();
    }
}

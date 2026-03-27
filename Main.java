package projetoJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Personagem guerreiro = new Guerreiro("Fenix", 220, 70, 40, 50);
        Personagem arqueiro = new Arqueiro("Negro", 170, 85, 30, 60);
        Personagem mago = new Mago("Kersx", 140, 100, 20, 80);

        System.out.println("=== ESCOLHA SEU PERSONAGEM ===");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Arqueiro");
        System.out.println("3 - Mago");

        int escolha = sc.nextInt();

        Personagem jogador;

        switch (escolha) {
            case 1:
                jogador = guerreiro;
                break;
            case 2:
                jogador = arqueiro;
                break;
            case 3:
                jogador = mago;
                break;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        System.out.println("\n=== ESCOLHA O ALVO ===");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Arqueiro");
        System.out.println("3 - Mago");

        int escolhaAlvo = sc.nextInt();

        Personagem alvo;

        switch (escolhaAlvo) {
            case 1:
                alvo = guerreiro;
                break;
            case 2:
                alvo = arqueiro;
                break;
            case 3:
                alvo = mago;
                break;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        System.out.println("\n=== AÇÃO ===");
        jogador.atacarOutro(alvo);

        System.out.println("\n=== STATUS DOS PERSONAGENS ===");
        guerreiro.exibirStatus();
        System.out.println();
        arqueiro.exibirStatus();
        System.out.println();
        mago.exibirStatus();

        sc.close();
    }
}
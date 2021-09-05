package br.inatel.c206l4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();

        Scanner sc = new Scanner(System.in);

        System.out.print("Seja bem-vindo, digite o nome do jogador: ");
        jogador.nome = sc.nextLine();

        System.out.print("Digite agora o email do jogador: ");
        jogador.email = sc.nextLine();

        System.out.print("Quantos personagens você cadastrará? ");
        int numeroDePersonagens = Integer.parseInt(sc.nextLine());
        while (numeroDePersonagens == 0) {
            System.out.println(
                    "É necessário cadastrar ao menos um personagem ou pressionar ctrl+c para finalizar o programa!");
            System.out.print("Digite novamente quantos personagens você cadastrará: ");

            numeroDePersonagens = Integer.parseInt(sc.nextLine());

        }
        jogador.personagens = new Personagem[numeroDePersonagens];

        for (int i = 0; i < numeroDePersonagens; i++) {
            Personagem personagem = new Personagem();

            System.out.print("Digite a classe do personagem número " + (i + 1) + " : ");
            personagem.classe = sc.nextLine();

            System.out.print("Qual a arma deste personagem? ");
            personagem.arma = sc.nextLine();

            System.out.print("Qual a nível deste personagem? ");
            personagem.nivel = Integer.parseInt(sc.nextLine());

            System.out.print("Qual o poder deste personagem? ");
            personagem.poder = Double.parseDouble(sc.nextLine());

            System.out.print("Este personagem usa magia? Responda com true para sim e false para não: ");
            personagem.usaMagia = Boolean.parseBoolean(sc.nextLine());

            jogador.adicionarPersonagem(personagem);
        }

        boolean running = true;

        System.out.println("");
        System.out.println("Agora que você já fez todos os cadastros, informe qual operação você deseja");

        while (running) {
            System.out.println("");
            System.out.println("------------------------");
            System.out.println("Opção 1 - Mostrar informações do jogador");
            System.out.println("Opção 2 - Mostrar informações de todos os personagens cadastrados");
            System.out.println("Opção 3 - Mostrar quantos personagens usam magia");
            System.out.println("Opção 4 - Mostrar média do nível dos personagens");
            System.out.println("Opção 9 - Sair do programa");
            System.out.println("------------------------");

            System.out.print("Digite aqui sua opção: ");
            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    jogador.mostraInfo();
                    break;
                case 2:
                    for (int i = 0; i < jogador.personagens.length; i++) {
                        if (jogador.personagens[i] != null) {
                            jogador.personagens[i].mostraInfo();
                        }
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("------------------------");
                    System.out.println("O número de personagens que usam magia é: " + jogador.calculaMagia());
                    System.out.println("------------------------");
                    System.out.println("");
                    break;
                case 4:
                    jogador.mostraMediaNivel();
                    break;
                default:
                    running = false;
                    System.out.println("");
                    System.out.println("------------------------");
                    System.out.println("Programa encerrado!");
                    System.out.println("------------------------");
                    System.out.println("");
                    break;

            }
        }

        sc.close();
    }
}

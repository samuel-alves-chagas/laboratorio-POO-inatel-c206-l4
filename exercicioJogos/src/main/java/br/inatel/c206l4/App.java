package br.inatel.c206l4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Plataforma plataforma = new Plataforma();

        Scanner sc = new Scanner(System.in);

        System.out.print("Seja bem-vindo, digite o nome da plataforma: ");
        plataforma.nome = sc.nextLine();

        System.out.print("Digite agora o nome do criador da plataforma: ");
        plataforma.criador = sc.nextLine();

        System.out.print("Quantos jogos você cadastrará? ");
        int numeroDeJogos = Integer.parseInt(sc.nextLine());

        plataforma.jogos = new Jogo[numeroDeJogos];

        for (int i = 0; i < numeroDeJogos; i++) {
            Jogo jogo = new Jogo();

            System.out.print("Digite o nome do jogo número " + (i + 1) + " : ");
            jogo.nome = sc.nextLine();

            System.out.print("Qual o gênero deste jogo? ");
            jogo.genero = sc.nextLine();

            System.out.print("Qual o preço deste jogo? ");
            jogo.preco = Double.parseDouble(sc.nextLine());

            System.out.print("Este jogo possui DLC? Responda com true para sim e false para não: ");
            jogo.dlc = Boolean.parseBoolean(sc.nextLine());

            plataforma.adicionarJogo(jogo);
        }

        boolean running = true;

        System.out.println("Agora que você já fez todos os cadastros, informe qual operação você deseja fazer");

        while (running) {
            System.out.println("");
            System.out.println("------------------------");
            System.out.println("Opção 1 - Mostrar informações da plataforma");
            System.out.println("Opção 2 - Mostrar qual jogo é o mais caro e qual o mais barato");
            System.out.println("Opção 3 - Mostrar quantos jogos possuem DLC");
            System.out.println("Opção 9 - Sair do programa");
            System.out.println("------------------------");

            System.out.print("Digite aqui sua opção: ");
            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    plataforma.mostraInfo();
                    break;
                case 2:
                    plataforma.mostraMaisCaroBarato();
                    break;
                case 3:
                    plataforma.calculaDLC();
                    break;
                default:
                    running = false;
                    break;

            }
        }

        sc.close();
    }
}

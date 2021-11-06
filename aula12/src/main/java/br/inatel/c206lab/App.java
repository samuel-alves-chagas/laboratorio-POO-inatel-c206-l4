package br.inatel.c206lab;

import br.inatel.c206lab.control.Arquivo;
import br.inatel.c206lab.model.Jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem-vindo, quantos jogos deseja cadastrar? ");
        int numeroDeJogos = Integer.parseInt(sc.nextLine());

        while (numeroDeJogos == 0) {
            System.out
                    .println("É necessário cadastrar ao menos um jogo ou pressionar ctrl+c para finalizar o programa!");
            System.out.print("Digite novamente quantos jogos você cadastrará: ");
            numeroDeJogos = Integer.parseInt(sc.nextLine());
        }

        ArrayList<Jogo> listaDeJogos = new ArrayList<>();

        for (int i = 0; i < numeroDeJogos; i++) {
            Jogo jogoAtual = new Jogo();

            System.out.print("Digite o nome do jogo " + (i + 1) + " : ");
            jogoAtual.setNome(sc.nextLine());

            System.out.print("Qual o preço deste jogo? ");
            jogoAtual.setPreco(Double.parseDouble(sc.nextLine()));

            System.out.print("Qual o gênero do jogo? ");
            jogoAtual.setGenero(sc.nextLine());

            listaDeJogos.add(jogoAtual);
        }

        Arquivo arquivo = new Arquivo();
        arquivo.escrever(listaDeJogos);

        sc.close();

        ArrayList<Jogo> jogosSalvos = new ArrayList<>();
        jogosSalvos = arquivo.ler();

        System.out.println("Os jogos salvos foram");

        for (Jogo jogoAtual : jogosSalvos) {
            System.out.println("Nome: " + jogoAtual.getNome());
            System.out.println("Preço: " + jogoAtual.getPreco());
            System.out.println("Gênero: " + jogoAtual.getGenero());
        }

    }
}
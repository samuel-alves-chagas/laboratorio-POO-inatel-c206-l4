package br.inatel.c206l4;

public class Plataforma {
  public String nome;
  public String criador;
  public Jogo[] jogos;

  public void mostraInfo() {

    System.out.println("");
    System.out.println("------------------------");
    System.out.println("Nome da plataforma: " + nome);
    System.out.println("Criador da plataforma: " + criador);
    System.out.println("Os jogos da plataforma são:");

    for (int i = 0; i < jogos.length; i++) {
      if (jogos[i] != null) {
        System.out.println(jogos[i].nome);
      }
    }

    System.out.println("------------------------");
    System.out.println("");

  }

  public void adicionarJogo(Jogo novoJogo) {
    for (int i = 0; i < jogos.length; i++) {
      if (jogos[i] == null) {
        jogos[i] = novoJogo;
        break;
      }
    }
  }

  public void mostraMaisCaroBarato() {
    double precoMaisCaro = Double.MIN_VALUE;
    double precoMaisBarato = Double.MAX_VALUE;

    String jogoMaisCaro = "";
    String jogoMaisBarato = "";

    for (int i = 0; i < jogos.length; i++) {
      if (jogos[i] != null) {

        if (jogos[i].preco > precoMaisCaro) {
          precoMaisCaro = jogos[i].preco;
          jogoMaisCaro = jogos[i].nome;
        }

        if (jogos[i].preco < precoMaisBarato) {
          precoMaisBarato = jogos[i].preco;
          jogoMaisBarato = jogos[i].nome;
        }
      }
    }
    System.out.println("");
    System.out.println("------------------------");
    System.out.println("O jogo mais barato é o: " + jogoMaisBarato + ", com preço de: " + precoMaisBarato);
    System.out.println("O jogo mais caro é o: " + jogoMaisCaro + ", com preço de: " + precoMaisCaro);
    System.out.println("------------------------");
    System.out.println("");
  }

  public void calculaDLC() {

    int count = 0;
    for (int i = 0; i < jogos.length; i++) {
      if (jogos[i] != null) {

        if (jogos[i].dlc) {
          count++;
        }
      }
    }
    System.out.println("");
    System.out.println("------------------------");
    System.out.println("O número de jogos com DLC é: " + count);
    System.out.println("------------------------");
    System.out.println("");

  }
}

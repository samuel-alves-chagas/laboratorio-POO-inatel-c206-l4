package br.inatel.c206l4;

public class Jogo {
  public String nome;
  public String genero;
  public double preco;
  public boolean dlc;

  public void mostraInfo() {
    System.out.println("");
    System.out.println("------------------------");
    System.out.println("Nome do jogo: " + nome);
    System.out.println("Gênero do jogo: " + genero);
    System.out.println("Preço do jogo: " + preco);
    System.out.println("Tem DLC? " + (dlc ? "Sim" : "Não"));
    System.out.println("------------------------");
    System.out.println("");

  }
}

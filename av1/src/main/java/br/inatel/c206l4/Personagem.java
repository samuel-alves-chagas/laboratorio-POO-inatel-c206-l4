package br.inatel.c206l4;

public class Personagem {
  public String classe;
  public String arma;
  public int nivel;
  public double poder;
  public boolean usaMagia;

  public void mostraInfo() {
    System.out.println("");
    System.out.println("------------------------");
    System.out.println("As informações deste personagem são: ");
    System.out.println("Classe: " + classe);
    System.out.println("Gênero: " + arma);
    System.out.println("Nível: " + nivel);
    System.out.println("Poder: " + poder);
    System.out.println("Usa Magia? " + (usaMagia ? "Sim" : "Não"));
    System.out.println("------------------------");
    System.out.println("");

  }
}

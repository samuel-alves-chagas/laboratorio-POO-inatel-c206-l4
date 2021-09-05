package br.inatel.c206l4;

public class Jogador {
  public String nome;
  public String email;
  public Personagem[] personagens;

  public void mostraInfo() {

    System.out.println("");
    System.out.println("------------------------");
    System.out.println("As informações do Jogador são: ");
    System.out.println("Nome: " + nome);
    System.out.println("Email: " + email);
    System.out.println("------------------------");
    System.out.println("");

  }

  public void adicionarPersonagem(Personagem novoPersonagem) {
    for (int i = 0; i < personagens.length; i++) {
      if (personagens[i] == null) {
        personagens[i] = novoPersonagem;
        break;
      }
    }
  }

  public int calculaMagia() {

    int count = 0;
    for (int i = 0; i < personagens.length; i++) {
      if (personagens[i] != null) {
        if (personagens[i].usaMagia) {
          count++;
        }
      }
    }

    return count;

  }

  public void mostraMediaNivel() {
    int nivelTotal = 0;
    for (int i = 0; i < personagens.length; i++) {
      if (personagens[i] != null) {
        nivelTotal = nivelTotal + personagens[i].nivel;
      }
    }

    double media = nivelTotal / (personagens.length * 1.0);

    System.out.println("");
    System.out.println("------------------------");
    System.out.println("O nível médio dos personagens é : " + media);
    System.out.println("------------------------");
    System.out.println("");
  }

}

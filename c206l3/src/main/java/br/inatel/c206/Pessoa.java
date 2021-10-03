package br.inatel.c206;

public class Pessoa {
  public String nome;
  public int cpf;
  public Endereco[] enderecosDoPhyll;

  public Pessoa(String nome, int cpf, int qtdEndereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.enderecosDoPhyll = new Endereco[qtdEndereco];
  }

  public void addEndereco(Endereco end) {
    for (int i = 0; i < enderecosDoPhyll.length; i++) {
      if (enderecosDoPhyll[i] == null) {
        enderecosDoPhyll[i] = end;
        break;
      }
    }
  }

  public void mostraInfo() {
    System.out.println("O nome dessa pessoa é " + nome);
    System.out.println("O cpf do(a) " + nome + " é " + cpf);
    for (int i = 0; i < enderecosDoPhyll.length; i++) {
      if (enderecosDoPhyll[i] != null) {
        System.out.println("Um dos endereços dessa pessoa é: Rua " + enderecosDoPhyll[i].rua + " , bairro: "
            + enderecosDoPhyll[i].bairro + " , número " + enderecosDoPhyll[i].num);
      }
    }
  }
}

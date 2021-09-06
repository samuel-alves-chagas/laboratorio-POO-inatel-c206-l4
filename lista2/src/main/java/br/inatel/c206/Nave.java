package br.inatel.c206;

public class Nave {
  private String nome;
  private int vida;

  public String getNome() {
    return nome;
  }

  public int getVida() {
    return vida;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public Nave() {
    this.nome = "Nave";
    this.vida = 100;
  }
}

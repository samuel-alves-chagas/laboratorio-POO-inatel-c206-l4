package br.inatel.c206;

public class Nave {
  public int cont = 0;
  private int vida;

  public Nave() {
    this.vida = 100;
    cont++;
  }

  public void mostraInfo() {
    System.out.println(vida);
  }

  public void trocaVida(Nave nave) {
    this.vida = nave.getVida();
    nave.setVida(this.vida);
  }

  public int getCont() {
    return cont;
  }

  public int getVida() {
    return vida;
  }

  public void setCont(int cont) {
    this.cont = cont;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }
}

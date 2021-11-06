package br.inatel.c206l4.model;

public class Seriado implements Comparable<Seriado> {
  public String nome;
  public String streaming;
  public int temporadas;
  public int anoCriacao;

  @Override
  public int compareTo(Seriado o) {
    return nome.compareTo(o.nome);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getStreaming() {
    return streaming;
  }

  public void setStreaming(String streaming) {
    this.streaming = streaming;
  }

  public int getTemporadas() {
    return temporadas;
  }

  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  }

  public int getAnoCriacao() {
    return anoCriacao;
  }

  public void setAnoCriacao(int anoCriacao) {
    this.anoCriacao = anoCriacao;
  }
}

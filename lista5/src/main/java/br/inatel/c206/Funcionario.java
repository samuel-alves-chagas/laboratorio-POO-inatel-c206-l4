package br.inatel.c206;

public class Funcionario {
  private int identificador;
  private String estadoCivil;
  private String grauInstrucao;
  private int numeroFilhos;
  private double salario;

  public int getIdentificador() {
    return identificador;
  }

  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

  public String getEstadoCivil() {
    return estadoCivil;
  }

  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public String getGrauInstrucao() {
    return grauInstrucao;
  }

  public void setGrauInstrucao(String grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
  }

  public int getNumeroFilhos() {
    return numeroFilhos;
  }

  public void setNumeroFilhos(int numeroFilhos) {
    this.numeroFilhos = numeroFilhos;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}

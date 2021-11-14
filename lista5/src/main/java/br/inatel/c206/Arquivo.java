package br.inatel.c206;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
  public void escrever(ArrayList<Funcionario> listaDeFuncionarios) {

    OutputStream os = null;
    OutputStreamWriter osr = null;
    BufferedWriter bw = null;

    try {
      os = new FileOutputStream("func_filtrado.csv", true); // salvar no arquivo
      osr = new OutputStreamWriter(os); // conversor
      bw = new BufferedWriter(osr); // o q vai digitar

      // Escrevendo o cabeçalho
      bw.write("Identificador,Filhos,Salario" + "\n");

      // Salvando em formato csv
      for (Funcionario funcionario : listaDeFuncionarios) {
        try {
          if (funcionario.getNumeroFilhos() > 0) {
            bw.write(funcionario.getIdentificador() + "," + funcionario.getNumeroFilhos() + ","
                + funcionario.getSalario() + "\n");
          }
        } catch (Exception e) {
          System.out.println("");
          System.out.println(e);
          System.out.println("");
          break;
        }
      }

    } catch (Exception e) {
      System.out.println(e);
    } finally {
      try {
        bw.close();
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }

  public ArrayList<Funcionario> ler() {

    InputStream is = null;
    InputStreamReader isr = null;
    BufferedReader br = null;
    ArrayList<Funcionario> acheiNoArquivo = new ArrayList<>();
    String linhaLer;

    try {

      is = new FileInputStream("funcionarios.csv");
      isr = new InputStreamReader(is);
      br = new BufferedReader(isr);

      linhaLer = br.readLine();
      while (linhaLer != null) {
        if (linhaLer.contains("Identificador")) {
          linhaLer = br.readLine();
        }
        System.out.println(linhaLer);
        String[] parts = linhaLer.split(",");

        Funcionario aux = new Funcionario();
        aux.setIdentificador(Integer.parseInt(parts[0]));
        aux.setEstadoCivil(parts[1]);
        aux.setGrauInstrucao(parts[2]);
        aux.setNumeroFilhos(Integer.parseInt(parts[3]));
        aux.setSalario(Double.parseDouble(parts[4]));

        acheiNoArquivo.add(aux);
        linhaLer = br.readLine();
      }
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      try {
        br.close();
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    return acheiNoArquivo;
  }

}
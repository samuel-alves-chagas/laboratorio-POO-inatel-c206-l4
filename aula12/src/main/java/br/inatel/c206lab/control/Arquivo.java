package br.inatel.c206lab.control;

import br.inatel.c206lab.model.Jogo;
import br.inatel.c206lab.exception.PrecoNegativoException;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
  public void escrever(ArrayList<Jogo> listaDeJogos) {

    OutputStream os = null;
    OutputStreamWriter osr = null;
    BufferedWriter bw = null;

    try {
      os = new FileOutputStream("Arquivo.txt", true); // salvar no arquivo
      osr = new OutputStreamWriter(os); // conversor
      bw = new BufferedWriter(osr); // o q vai digitar

      // Salvando em formato csv
      for (Jogo jogo : listaDeJogos) {
        try {
          if (jogo.getPreco() <= 0) {
            throw new PrecoNegativoException("Saldo Insuficiente");
          }
          bw.write("Jogo" + "\n");
          bw.write(jogo.getNome() + "\n");
          bw.write(jogo.getPreco() + "\n");
          bw.write(jogo.getGenero() + "\n");
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

  public ArrayList<Jogo> ler() {

    InputStream is = null;
    InputStreamReader isr = null;
    BufferedReader br = null;
    ArrayList<Jogo> acheiNoArquivo = new ArrayList<>();
    String linhaLer;

    try {

      is = new FileInputStream("Arquivo.txt");
      isr = new InputStreamReader(is);
      br = new BufferedReader(isr);

      linhaLer = br.readLine();
      while (linhaLer != null) {
        if (linhaLer.contains("Jogo")) {
          Jogo aux = new Jogo();
          aux.setNome(br.readLine());
          aux.setPreco(Double.parseDouble(br.readLine()));
          aux.setGenero(br.readLine());
          acheiNoArquivo.add(aux);
        }
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
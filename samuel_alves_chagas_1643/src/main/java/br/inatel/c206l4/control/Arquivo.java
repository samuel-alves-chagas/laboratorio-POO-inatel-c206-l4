package br.inatel.c206l4.control;

import br.inatel.c206l4.model.Seriado;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
  public void escrever(ArrayList<Seriado> listaDeSeriados) {

    OutputStream os = null;
    OutputStreamWriter osr = null;
    BufferedWriter bw = null;

    try {
      os = new FileOutputStream("seriados.txt", true); // salvar no arquivo
      osr = new OutputStreamWriter(os); // conversor
      bw = new BufferedWriter(osr); // o q vai digitar

      for (Seriado seriadoAtual : listaDeSeriados) {
        bw.write("Seriado" + "\n");
        bw.write(seriadoAtual.getNome() + "\n");
        bw.write(seriadoAtual.getStreaming() + "\n");
        bw.write(seriadoAtual.getTemporadas() + "\n");
        bw.write(seriadoAtual.getAnoCriacao() + "\n");
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

  public ArrayList<Seriado> ler() {

    InputStream is = null;
    InputStreamReader isr = null;
    BufferedReader br = null;
    ArrayList<Seriado> acheiNoArquivo = new ArrayList<>();
    String linhaLer;

    try {

      is = new FileInputStream("seriados.txt");
      isr = new InputStreamReader(is);
      br = new BufferedReader(isr);

      linhaLer = br.readLine();
      while (linhaLer != null) {
        if (linhaLer.contains("Seriado")) {
          Seriado aux = new Seriado();
          aux.nome = br.readLine();
          aux.streaming = br.readLine();
          aux.temporadas = Integer.parseInt(br.readLine());
          aux.anoCriacao = Integer.parseInt(br.readLine());
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
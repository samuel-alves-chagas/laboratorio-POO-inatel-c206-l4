package br.inatel.c206l4;

import br.inatel.c206l4.control.Arquivo;
import br.inatel.c206l4.exception.TemporadaException;
import br.inatel.c206l4.model.Seriado;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        ArrayList<Seriado> listaDeSeriados = new ArrayList<>();

        try {
            Seriado theOffice = new Seriado();
            theOffice.setNome("The Office");
            theOffice.setStreaming("Prime Video");
            theOffice.setTemporadas(9);
            theOffice.setAnoCriacao(2005);

            if (theOffice.getTemporadas() <= 1) {
                throw new TemporadaException("O seriado " + theOffice.getNome() + " possui 1 ou menos de 1 temporada");
            }
            listaDeSeriados.add(theOffice);
        } catch (TemporadaException e) {
            System.out.println(e);
        }

        try {
            Seriado breakingBad = new Seriado();
            breakingBad.setNome("Breaking Bad");
            breakingBad.setStreaming("Netflix");
            breakingBad.setTemporadas(5);
            breakingBad.setAnoCriacao(2008);

            if (breakingBad.getTemporadas() <= 1) {
                throw new TemporadaException(
                        "O seriado " + breakingBad.getNome() + " possui 1 ou menos de 1 temporada");
            }
            listaDeSeriados.add(breakingBad);
        } catch (TemporadaException e) {
            System.out.println(e);
        }

        try {
            Seriado thePunisher = new Seriado();
            thePunisher.setNome("The Punisher");
            thePunisher.setStreaming("Netflix");
            thePunisher.setTemporadas(1);
            thePunisher.setAnoCriacao(2017);

            if (thePunisher.getTemporadas() <= 1) {
                throw new TemporadaException(
                        "O seriado " + thePunisher.getNome() + " possui 1 ou menos de 1 temporada");
            }
            listaDeSeriados.add(thePunisher);
        } catch (TemporadaException e) {
            System.out.println(e);
        }

        try {
            Seriado seinfeld = new Seriado();
            seinfeld.setNome("Seinfeld");
            seinfeld.setStreaming("Netflix");
            seinfeld.setTemporadas(9);
            seinfeld.setAnoCriacao(1989);

            if (seinfeld.getTemporadas() <= 1) {
                throw new TemporadaException("O seriado " + seinfeld.getNome() + " possui 1 ou menos de 1 temporada");
            }
            listaDeSeriados.add(seinfeld);
        } catch (TemporadaException e) {
            System.out.println(e);
        }

        Arquivo arquivo = new Arquivo();
        arquivo.escrever(listaDeSeriados);

        ArrayList<Seriado> SeriadosSalvos = new ArrayList<>();
        SeriadosSalvos = arquivo.ler();

        System.out.println("Os Seriados lidos foram");
        System.out.println("");

        for (Seriado SeriadoAtual : SeriadosSalvos) {
            System.out.println("Nome: " + SeriadoAtual.getNome());
            System.out.println("Streaming: " + SeriadoAtual.getStreaming());
            System.out.println("Temporadas: " + SeriadoAtual.getTemporadas());
            System.out.println("Ano de Criação: " + SeriadoAtual.getAnoCriacao());
            System.out.println("");
        }

        Collections.sort(SeriadosSalvos);
        System.out.println("Ordenando os seriados por ordem crescente");
        for (Seriado SeriadoAtual : SeriadosSalvos) {
            System.out.println("Nome: " + SeriadoAtual.getNome());
            System.out.println("Streaming: " + SeriadoAtual.getStreaming());
            System.out.println("Temporadas: " + SeriadoAtual.getTemporadas());
            System.out.println("Ano de Criação: " + SeriadoAtual.getAnoCriacao());
            System.out.println("");
        }

        Collections.reverse(SeriadosSalvos);
        System.out.println("Ordenando os seriados por ordem decrescente");
        for (Seriado SeriadoAtual : SeriadosSalvos) {
            System.out.println("Nome: " + SeriadoAtual.getNome());
            System.out.println("Streaming: " + SeriadoAtual.getStreaming());
            System.out.println("Temporadas: " + SeriadoAtual.getTemporadas());
            System.out.println("Ano de Criação: " + SeriadoAtual.getAnoCriacao());
            System.out.println("");
        }
    }
}

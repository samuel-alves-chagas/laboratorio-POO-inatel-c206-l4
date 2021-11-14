package br.inatel.c206;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();

        Arquivo arquivo = new Arquivo();
        listaDeFuncionarios = arquivo.ler();
        arquivo.escrever(listaDeFuncionarios);
    }
}

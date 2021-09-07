package br.inatel.c206;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Nave n1 = new Nave();
        Nave n2 = new Nave();
        Nave n3 = new Nave();

        n2.trocaVida(n3);

        System.out.println(n2.cont);
        n1.mostraInfo();
        n2.mostraInfo();
    }
}

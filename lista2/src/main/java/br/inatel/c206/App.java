package br.inatel.c206;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Nave n1 = new Nave();
        Nave n2 = new Nave();
        if (n1 == n2)
            n1.setVida(35);
        else
            n2.setVida(40);
        n1 = n2;

        System.out.println(n2.getVida() + " " + n1.getVida());
    }
}

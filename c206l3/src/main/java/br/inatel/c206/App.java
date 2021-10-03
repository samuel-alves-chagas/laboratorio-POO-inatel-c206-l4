package br.inatel.c206;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Pessoa Samuel = new Pessoa("Samuel", 1234567891, 1);
        Endereco casaDoSamuel = new Endereco("José Vilela Neto", "Petro oil", 30);
        Samuel.addEndereco(casaDoSamuel);
        Samuel.mostraInfo();

        Pessoa Phyll = new Pessoa("Phyll", 40028922, 2);
        Endereco casaDoPhyll = new Endereco("Baker Street", "Marylebone", 221);
        Endereco casaDoPhyll2 = new Endereco("Rua da Paixão", "Cupido", 69);
        Phyll.addEndereco(casaDoPhyll);
        Phyll.addEndereco(casaDoPhyll2);
        Phyll.mostraInfo();

    }
}

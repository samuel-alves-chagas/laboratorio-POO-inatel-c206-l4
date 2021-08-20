public class Principal {
    public static void main(String[] args) {

        System.out.println("Cadastrando materiais...");

        Materiais carburador = new Materiais();
        Materiais vela = new Materiais();
        Materiais pistao = new Materiais();

        carburador.codigoDeSerie = "XRL8-2021";
        carburador.codigo = "AEF44";
        carburador.nome = carburador.gerarNome("carburador");
        carburador.categoria = "motor";
        carburador.quantidade = 1;

        vela.codigoDeSerie = "IGN-2021";
        vela.codigo = "SMT30";
        vela.nome = vela.gerarNome("vela");
        vela.categoria = "motor";
        vela.quantidade = 4;

        pistao.codigoDeSerie = "BMW-2021";
        pistao.codigo = "KB63";
        pistao.nome = pistao.gerarNome("pistao");
        pistao.categoria = "motor";
        pistao.quantidade = 4;

        System.out.println("O código de série é: " + carburador.codigoDeSerie);
        System.out.println("O código do material é: " + carburador.codigo);
        System.out.println("O nome é: " + carburador.nome);
        System.out.println("A categoria é: " + carburador.categoria);
        System.out.println("A quantidade de materiais é: " + carburador.quantidade);

        System.out.println("");

        System.out.println("O código de série é: " + vela.codigoDeSerie);
        System.out.println("O código do material é: " + vela.codigo);
        System.out.println("O nome é: " + vela.nome);
        System.out.println("A categoria é: " + vela.categoria);
        System.out.println("A quantidade de materiais é: " + vela.quantidade);

        System.out.println("");

        System.out.println("O código de série é: " + pistao.codigoDeSerie);
        System.out.println("O código do material é: " + pistao.codigo);
        System.out.println("O nome é: " + pistao.nome);
        System.out.println("A categoria é: " + pistao.categoria);
        System.out.println("A quantidade de materiais é: " + pistao.quantidade);


    }
}

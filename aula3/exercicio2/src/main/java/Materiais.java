public class Materiais {
    String codigoDeSerie;
    String codigo;
    String nome;
    String categoria;
    int quantidade;

    String gerarNome(String item){
        return item + "_" + this.codigo + "_" + this.codigoDeSerie;
    }
}

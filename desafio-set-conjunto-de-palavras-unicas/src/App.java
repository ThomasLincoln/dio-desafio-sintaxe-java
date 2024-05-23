public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoDePalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoDePalavrasUnicas();

        // Adicionando algumas palavras
        conjuntoPalavrasUnicas.adicionarPalavra("casa");
        conjuntoPalavrasUnicas.adicionarPalavra("carro");
        conjuntoPalavrasUnicas.adicionarPalavra("carro"); // Essa palavra já existe e não será adicionada
        conjuntoPalavrasUnicas.adicionarPalavra("moto");
        conjuntoPalavrasUnicas.adicionarPalavra("bicicleta");

        // Exibindo as palavras únicas
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // Verificando se uma palavra existe
        conjuntoPalavrasUnicas.verificarPalavra("carro");
        conjuntoPalavrasUnicas.verificarPalavra("motocicleta"); // Essa palavra não existe

        // Removendo uma palavra
        conjuntoPalavrasUnicas.removerPalavra("casa");

        // Exibindo as palavras únicas após a remoção
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}

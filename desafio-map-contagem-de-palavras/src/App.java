public class App {
    public static void main(String[] args) throws Exception {
        // Cria uma instância de ContagemPalavras
        ContagemPalavras contagem = new ContagemPalavras();

        // Adiciona algumas palavras e suas frequências
        contagem.adicionarPalavra("Java", 5);
        contagem.adicionarPalavra("Python", 8);
        contagem.adicionarPalavra("C", 3);
        contagem.adicionarPalavra("JavaScript", 7);

        // Exibe a contagem de todas as palavras
        System.out.println("Exibindo contagem de palavras:");
        contagem.exibirContagemPalavras();

        // Encontra e exibe a palavra mais frequente
        System.out.println("\nEncontrando a palavra mais frequente:");
        contagem.encontrarPalavraMaisFrequente();

        // Remove uma palavra
        System.out.println("\nRemovendo a palavra 'Python':");
        contagem.removerPalavra("Python");

        // Tenta encontrar a palavra removida novamente
        System.out.println("\nExibindo contagem de palavras após remoção:");
        contagem.exibirContagemPalavras();

        // Encontra e exibe a palavra mais frequente após a remoção
        System.out.println("\nEncontrando a palavra mais frequente após a remoção:");
        contagem.encontrarPalavraMaisFrequente();
    }
}

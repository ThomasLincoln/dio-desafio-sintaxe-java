public class App {
    public static void main(String[] args) throws Exception {
        // Cria uma instância de Dicionario
        Dicionario meuDicionario = new Dicionario();

        // Adiciona algumas palavras e definições
        meuDicionario.adicionarPalavra("Java", "Uma linguagem de programação orientada a objetos.");
        meuDicionario.adicionarPalavra("Python", "Uma linguagem de programação interpretada.");
        meuDicionario.adicionarPalavra("C", "Uma linguagem de programação de baixo nível.");

        // Exibe todas as definições no dicionário
        System.out.println("Exibindo palavras adicionadas:");
        meuDicionario.exibirPalavras();

        // Pesquisa por uma palavra existente
        System.out.println("\nPesquisando pela palavra 'Java':");
        meuDicionario.pesquisarPorPalavra("Java");

        // Pesquisa por uma palavra não existente
        System.out.println("\nPesquisando pela palavra 'Ruby':");
        meuDicionario.pesquisarPorPalavra("Ruby");

        // Remove uma palavra
        System.out.println("\nRemovendo a palavra 'Python':");
        meuDicionario.removerPalavra("Python");

        // Tenta pesquisar pela palavra removida
        System.out.println("\nPesquisando pela palavra 'Python' após a remoção:");
        meuDicionario.pesquisarPorPalavra("Python");

        // Exibe todas as definições no dicionário após a remoção
        System.out.println("\nExibindo palavras restantes:");
        meuDicionario.exibirPalavras();
    }
}

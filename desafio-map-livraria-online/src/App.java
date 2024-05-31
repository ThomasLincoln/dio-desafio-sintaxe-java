import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Cria uma instância de LivrariaOnline
        LivrariaOnline livraria = new LivrariaOnline();

        // Adiciona alguns livros à livraria
        livraria.adicionarLivro("https://example.com/livro1", "Livro A", "Autor X", 29.90);
        livraria.adicionarLivro("https://example.com/livro2", "Livro B", "Autor Y", 19.90);
        livraria.adicionarLivro("https://example.com/livro3", "Livro C", "Autor Z", 39.90);
        livraria.adicionarLivro("https://example.com/livro4", "Livro D", "Autor X", 9.90);

        // Exibe os livros ordenados por preço
        System.out.println("Exibindo livros ordenados por preço:");
        Map<String, Livro> livrosPorPreco = livraria.exibirLivrosOrdenadosPorPreco();
        for (Map.Entry<String, Livro> entry : livrosPorPreco.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Exibe os livros ordenados por autor
        System.out.println("\nExibindo livros ordenados por autor:");
        Map<String, Livro> livrosPorAutor = livraria.exibirLivrosOrdenadosPorAutor();
        for (Map.Entry<String, Livro> entry : livrosPorAutor.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Pesquisa livros por autor
        System.out.println("\nPesquisando livros pelo autor 'Autor X':");
        livraria.pesquisarLivrosPorAutor("Autor X");

        // Exibe o livro mais caro
        System.out.println("\nLivro mais caro:");
        Livro livroMaisCaro = livraria.obterLivroMaisCaro();
        System.out.println(livroMaisCaro);

        // Exibe o livro mais barato
        System.out.println("\nLivro mais barato:");
        Livro livroMaisBarato = livraria.exibirLivroMaisBarato();
        System.out.println(livroMaisBarato);

        // Remove um livro e exibe a lista de livros restantes
        System.out.println("\nRemovendo o livro 'Livro B':");
        livraria.removerLivro("Livro B");

        // Exibe os livros restantes após remoção
        System.out.println("\nExibindo livros restantes:");
        for (Map.Entry<String, Livro> entry : livraria.livraria.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

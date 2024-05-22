public class App {
    public static void main(String[] args) throws Exception {
        // Criar um catálogo de livros vazio
        CatalogoDeLivros catalogo = new CatalogoDeLivros();

        // Adicionar alguns livros ao catálogo
        catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogo.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogo.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalogo.adicionarLivro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);

        // Testar o método pesquisarPorAutor
        System.out.println("\nLivros do autor J.R.R. Tolkien:");
        catalogo.pesquisarPorAutor("J.R.R. Tolkien");

        // Testar o método pesquisarPorIntervaloAnos
        System.out.println("\nLivros publicados entre 1940 e 1960:");
        catalogo.pesquisarPorIntervaloAnos(1940, 1960);

        // Testar o método pesquisarPorTitulo
        System.out.println("\nLivro com o título \"Dom Quixote\":");
        catalogo.pesquisaPorTitulo("Dom Quixote");
    }
}

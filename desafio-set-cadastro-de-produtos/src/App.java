public class App {
    public static void main(String[] args) throws Exception {
        // Criando um objeto da classe CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando alguns produtos
        cadastroProdutos.adicionarProduto(1, "Camiseta", 20.00, 10);
        cadastroProdutos.adicionarProduto(3, "Tênis", 80.00, 2);
        cadastroProdutos.adicionarProduto(2, "Damasco", 50.00, 5);

        // Exibindo os produtos por nome
        System.out.println("\nProdutos por nome:");
        cadastroProdutos.exibirProdutosPorNome();

        // Exibindo os produtos por preço
        System.out.println("\nProdutos por preço:");
        cadastroProdutos.exibirProdutosPorPreco();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Cria uma instância de EstoqueProdutos
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Adiciona alguns produtos ao estoque
        estoque.adicionarProduto(1, "Notebook", 10, 2500.00);
        estoque.adicionarProduto(2, "Mouse", 50, 150.00);
        estoque.adicionarProduto(3, "Teclado", 30, 300.00);
        estoque.adicionarProduto(4, "Monitor", 20, 700.00);

        // Exibe todos os produtos no estoque
        System.out.println("Exibindo produtos no estoque:");
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        double valorTotal = estoque.calcularValorTotalEstoque();
        System.out.println("\nValor total do estoque: R$ " + valorTotal);

        // Obtém e exibe o produto mais caro
        System.out.println("\nProduto mais caro no estoque:");
        estoque.obterProdutoMaisCaro();

        // Obtém e exibe o produto mais barato
        System.out.println("\nProduto mais barato no estoque:");
        estoque.obterProdutoMaisBarato();

        // Obtém e exibe o produto com maior quantidade em estoque
        System.out.println("\nProduto com maior quantidade em estoque:");
        estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    }
}

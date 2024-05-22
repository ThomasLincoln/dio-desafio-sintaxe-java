public class App {
    public static void main(String[] args) throws Exception {
        // Criar um carrinho de compras vazio
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionar alguns itens ao carrinho
        carrinho.adicionarItem("Camisa", 25.90, 2);
        carrinho.adicionarItem("Calça Jeans", 49.99, 1);
        carrinho.adicionarItem("Tênis", 79.90, 1);

        // Exibir os itens no carrinho
        System.out.println("\nItens no Carrinho:");
        carrinho.exibirItens();

        // Calcular e exibir o valor total do carrinho
        double valorTotal = carrinho.calcularValorTotal();
        System.out.println("\nValor Total: R$" + valorTotal);

        // Remover um item do carrinho
        carrinho.removerItem("Camisa");

        // Exibir os itens no carrinho após a remoção
        System.out.println("\nItens no Carrinho (após remoção da camisa):");
        carrinho.exibirItens();

        // Calcular e exibir o novo valor total do carrinho
        valorTotal = carrinho.calcularValorTotal();
        System.out.println("\nNovo Valor Total: R$" + valorTotal);
    }
}

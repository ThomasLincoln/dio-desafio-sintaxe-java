import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> estoque;

  public EstoqueProdutos() {
    this.estoque = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    this.estoque.put(cod, new Produto(nome, quantidade, preco));
  }

  public void exibirProdutos() {
    System.out.println(this.estoque);
  }

  public double calcularValorTotalEstoque() {
    double valorTotal = 0.0;
    if (!this.estoque.isEmpty()) {
      for (Produto produto : this.estoque.values()) {
        valorTotal += produto.getPreco() * produto.getQuantidade();
      }
    }
    return valorTotal;
  }

  public void obterProdutoMaisCaro() {
    double maiorValor = Integer.MIN_VALUE;
    Produto produtoMaisCaro = new Produto(null, 0, 0);
    if (!this.estoque.isEmpty()) {
      for (Produto produto : this.estoque.values()) {
        if (produto.getPreco() > maiorValor) {
          maiorValor = produto.getPreco();
          produtoMaisCaro = produto;
        }
      }
      System.out.println(produtoMaisCaro.toString());
    } else {
      System.out.println("Não há produtos em estoque");
    }
  }

  public void obterProdutoMaisBarato() {
    double menorValor = Integer.MAX_VALUE;
    Produto produtoMaisBarato = new Produto(null, 0, 0);
    if (!this.estoque.isEmpty()) {
      for (Produto produto : this.estoque.values()) {
        if (produto.getPreco() < menorValor) {
          menorValor = produto.getPreco();
          produtoMaisBarato = produto;
        }
      }
      System.out.println(produtoMaisBarato.toString());
    } else {
      System.out.println("Não há produtos em estoque");
    }
  }

  public void obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    double maiorQuantidade = Integer.MIN_VALUE;
    Produto produtoEmMaiorNumero = new Produto(null, 0, 0);
    if (!this.estoque.isEmpty()) {
      for (Produto produto : this.estoque.values()) {
        if (produto.getQuantidade() * produto.getPreco() > maiorQuantidade) {
          maiorQuantidade = produto.getPreco() * produto.getQuantidade();
          produtoEmMaiorNumero = produto;
        }
      }
      System.out.println(produtoEmMaiorNumero.toString());
    } else {
      System.out.println("Não há produtos em estoque");
    }
  }
}

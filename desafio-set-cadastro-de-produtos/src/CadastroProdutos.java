import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  private Set<Produto> listaProdutos;

  public CadastroProdutos() {
    this.listaProdutos = new HashSet<>();
  }

  public void adicionarProduto(int cod, String nome, double preco, int quantidade) {
    this.listaProdutos.add(new Produto(nome, cod, preco, quantidade));
  }

  public void exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(this.listaProdutos);
    for (Produto produto : produtosPorNome) {
      System.out.println(produto.toString());
    }
  }
  public void exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    if(!listaProdutos.isEmpty()){
      produtosPorPreco.addAll(listaProdutos);
    }
    for (Produto produto : produtosPorPreco) {
      System.out.println(produto.toString());
    }
  }
}

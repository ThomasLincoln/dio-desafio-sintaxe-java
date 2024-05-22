import java.util.ArrayList;

public class CarrinhoDeCompras {
  ArrayList<Item> carrinho;

  public CarrinhoDeCompras() {
    this.carrinho = new ArrayList<Item>();
  }

  // adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao
  // carrinho com o nome, preço e quantidade especificados.
  public void adicionarItem(String nome, double preco, int quantidade){
    Item novoItem = new Item(nome, quantidade, preco);
    this.carrinho.add(novoItem);
  }

  // removerItem(String nome): Remove um item do carrinho com base no seu nome.
  public void removerItem(String nome){
    for (Item item : this.carrinho) {
      if(item.getNome().equals(nome)){
        this.carrinho.remove(item);
        return;
      }
    }

    System.out.println("Item \"" + nome + "\" não encontrada.");
  }

  // calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em
  // consideração o preço e a quantidade de cada item.
  public double calcularValorTotal(){
    double precoTotal = 0;
    for (Item item : this.carrinho) {
      precoTotal += item.getPreco() * item.getQuantidade();      
    }
    return precoTotal;
  }

  // exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus
  // nomes, preços e quantidades.
  public void exibirItens(){
    for (Item item : this.carrinho) {
      System.out.println(item.toString());
    }
  }
}

import java.util.*;

public class LivrariaOnline {
  public Map<String, Livro> livraria;

  public LivrariaOnline() {
    this.livraria = new HashMap<>();

  }

  public void adicionarLivro(String link,
      String titulo, String autor, double preco) {
    this.livraria.put(link, new Livro(titulo, autor, preco));
  }

  public void removerLivro(String titulo) {
    List<String> chavesRemover = new ArrayList<>();
    for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
      if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
        chavesRemover.add(entry.getKey());
      }
    }
    for (String chave : chavesRemover) {
      livraria.remove(chave);
    }
  }

  public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
    List<Map.Entry<String, Livro>> livrosPorPreco = new ArrayList<>(livraria.entrySet());
    Collections.sort(livrosPorPreco, new ComparatorPorPreco());
    Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

    for (Map.Entry<String, Livro> entry : livrosPorPreco) {
      livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
    }
    return livrosOrdenadosPorPreco;
  }

  public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
    List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(livraria.entrySet());
    Collections.sort(livrosParaOrdenar, new ComparatorPorAutor());
    Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();

    for (Map.Entry<String, Livro> entry : livrosParaOrdenar) {
      livrosOrdenados.put(entry.getKey(), entry.getValue());
    }

    return livrosOrdenados;
  }

  public void pesquisarLivrosPorAutor(String autor) {
    for (Map.Entry<String, Livro> entry : this.livraria.entrySet()) {
      if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
        System.out.println("Encontrei: ");
        System.out.println(entry.getValue().toString());
        System.out.println("URL: " + entry.getKey());
      }
    }
  }

  public Livro obterLivroMaisCaro() {
    double maiorPreco = -1;
    Livro livroMaisCaro = new Livro(null, null, 0);

    for (Map.Entry<String, Livro> entry : this.livraria.entrySet()) {
      if (entry.getValue().getPreco() > maiorPreco) {
        maiorPreco = entry.getValue().getPreco();
        livroMaisCaro = entry.getValue();
      }
    }
    return livroMaisCaro;
  }

  public Livro exibirLivroMaisBarato() {
    double menorPreco = Double.MAX_VALUE;
    Livro livroMaisBarato = new Livro(null, null, 0);

    for (Map.Entry<String, Livro> entry : this.livraria.entrySet()) {
      if (entry.getValue().getPreco() < menorPreco) {
        menorPreco = entry.getValue().getPreco();
        livroMaisBarato = entry.getValue();
      }
    }
    return livroMaisBarato;
  }
}

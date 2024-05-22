import java.util.ArrayList;

public class CatalogoDeLivros {
  ArrayList<Livro> catalogo;

  public CatalogoDeLivros() {
    this.catalogo = new ArrayList<Livro>();
  }

  // adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um
  // livro ao catálogo.
  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    Livro novoLivro = new Livro(titulo, autor, anoPublicacao);
    this.catalogo.add(novoLivro);
  }

  // pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma
  // lista com os livros encontrados.
  public void pesquisarPorAutor(String autor) {
    for (Livro livro : this.catalogo) {
      if (livro.getAutor().equals(autor)) {
        System.out.println(livro.toString());
      }
    }

  }

  // pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros
  // publicados em um determinado intervalo de anos e retorna uma lista com os
  // livros encontrados.
  public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    for (Livro livro : this.catalogo) {
      int anoPublicacao = livro.getAnoDePublicao();
      if (anoPublicacao >= anoInicial && anoPublicacao <= anoFinal) {
        System.out.println(livro.toString());
      }
    }
  }

  // pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o
  // primeiro livro encontrado.
  public void pesquisaPorTitulo(String titulo) {
    for (Livro livro : this.catalogo) {
      if (livro.getTitulo().equals(titulo)) {
        System.out.println(livro.getTitulo());
        return;
      }
    }
  }

}

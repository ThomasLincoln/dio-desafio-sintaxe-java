public class Livro {
  private String titulo;
  private String autor;
  private int anoDePublicao;

  public Livro(String titulo, String autor, int anoDePublicao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoDePublicao = anoDePublicao;
  }
  
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }
  public int getAnoDePublicao() {
    return anoDePublicao;
  }
  public void setAnoDePublicao(int anoDePublicao) {
    this.anoDePublicao = anoDePublicao;
  }

  @Override
  public String toString() {
    return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoDePublicao=" + anoDePublicao + "]";
  }

  

}

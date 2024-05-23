import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavrasUnicas {
  private Set<String> palavrasUnicas;

  public ConjuntoDePalavrasUnicas(){
    this.palavrasUnicas = new HashSet<>();
  }

  public void adicionarPalavra(String palavra){
    if(!this.palavrasUnicas.contains(palavra)){
      this.palavrasUnicas.add(palavra);
    }else{
      System.out.println("Palavra " + palavra + " já existe.");
    }
  }

  public void removerPalavra(String palavra){
    this.palavrasUnicas.remove(palavra);
  }

  public void verificarPalavra(String palavra){
    if(this.palavrasUnicas.contains(palavra)){
      System.out.println("Palavra " + palavra + " encontrada");
    }else{
      System.out.println("Palavra " + palavra + " não encontrada");
    }
  }

  public void exibirPalavrasUnicas(){
    for (String palavra : palavrasUnicas) {
      System.out.println(palavra.toString());
    }
  }
}

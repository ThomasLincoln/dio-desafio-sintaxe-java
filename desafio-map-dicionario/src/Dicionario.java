import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionario;

  public Dicionario(){
    this.dicionario = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao){
    this.dicionario.put(palavra, definicao);
  }

  public void removerPalavra(String palavra){
    this.dicionario.remove(palavra);
  }

  public void exibirPalavras(){
    System.out.println(this.dicionario.toString());
  }

  public void pesquisarPorPalavra(String palavra){
    if(this.dicionario.containsKey(palavra)){
      System.out.println("A definição da palavras " + palavra + " é " 
        + this.dicionario.get(palavra));
    }else{
      System.out.println("Palavra não encontrada");
    }
  }
}

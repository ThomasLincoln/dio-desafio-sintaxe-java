import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  private Map<String, Integer> contagem;

  public ContagemPalavras() {
    this.contagem = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer frequencia) {
    this.contagem.put(palavra, frequencia);
  }

  public void removerPalavra(String palavra) {
    if (!this.contagem.isEmpty() && this.contagem.containsKey(palavra)) {
      this.contagem.remove(palavra);
    }
  }

  public void exibirContagemPalavras() {
    System.out.println(this.contagem);
  }

  public void encontrarPalavraMaisFrequente() {
    String palavraMaisFrequence = null;
    int maiorContagem = 0;
    for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
      if (entry.getValue() > maiorContagem) {
        maiorContagem = entry.getValue();
        palavraMaisFrequence = entry.getKey();
      }
    }
    System.out.println("A palavra mais frequente é " + palavraMaisFrequence 
      + " que apareceu " + maiorContagem + " vezes");
  }
}

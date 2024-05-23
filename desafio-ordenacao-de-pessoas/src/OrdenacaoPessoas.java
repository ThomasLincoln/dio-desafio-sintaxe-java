import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  List<Pessoa> listaDePessoas;

  public OrdenacaoPessoas() {
    this.listaDePessoas = new ArrayList<>();
  }
  // adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à
  // lista.

  public void adicionarPessoa(String nome, int idade, double altura) {
    Pessoa novaPessoa = new Pessoa(nome, idade, altura);
    this.listaDePessoas.add(novaPessoa);
  }

  // ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface
  // Comparable.
  public List<Pessoa> ordenarPorIdade() {
    // cria uma lista a partir da outra lista
    List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
    // verifica se a lista de pessoas está vazia
    if (!listaDePessoas.isEmpty()) {
      // chama o método sort da classe collections para ordenar as pessoas
      Collections.sort(pessoasPorIdade);
      // retorna o resultado
      return pessoasPorIdade;
    } else {
      throw new RuntimeException("A lista está vazia");
    }
  }

  // ordenarPorAltura(): Ordena as pessoas da lista por altura usando um
  // Comparator personalizado.
  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoaPorAltura = new ArrayList<>(listaDePessoas);
    if(!listaDePessoas.isEmpty()){
      Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
      return pessoaPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia");
    }
  }

}

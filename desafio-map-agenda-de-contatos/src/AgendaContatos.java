import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> agenda;

  public AgendaContatos() {
    this.agenda = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agenda.put(nome, telefone);
  }

  public void removerContato(String nome) {
    agenda.remove(nome);

  }

  public void exibirContatos() {
    System.out.println(agenda.values());
  }

  public void pesquisarPorNome(String nome) {
    if (agenda.containsKey(nome)) {
      System.out.println("Telefone de " + nome + ": " + agenda.get(nome));
    } else {
      System.out.println("Contato não encontrado.");
    }
  }
}

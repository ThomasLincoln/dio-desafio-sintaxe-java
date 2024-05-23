import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> agendaDeContatos;

  public AgendaContatos(){
    this.agendaDeContatos = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero){
    this.agendaDeContatos.add(new Contato(nome, numero));
  }

  public void exibirContatos(){
    for (Contato contato : this.agendaDeContatos) {
      System.out.println(contato.toString());
    }
  }

  public Set<Contato> pesquisarPorNome(String nome){
    Set<Contato> busca = new HashSet<>();
    for (Contato contato : this.agendaDeContatos) {
      if(contato.getNome().startsWith(nome)){
        busca.add(contato);
      }
    }
    return busca;
  }

  public void atualizarNumeroContato(String nome, int novoNumero){
    for (Contato contato : this.agendaDeContatos) {
      if(contato.getNome().equals(nome)){
        contato.setNumeroTelefone(novoNumero);
        break;
      }
    }
  } 
}

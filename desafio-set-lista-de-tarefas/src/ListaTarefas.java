import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  private Set <Tarefa> listaDeTarefas;

  public ListaTarefas(){
    this.listaDeTarefas = new HashSet<Tarefa>();
  }

  public void adicionarTarefa(String descricao){
    this.listaDeTarefas.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao){
    for (Tarefa tarefa : this.listaDeTarefas) {
      if(tarefa.getDescricao().equals(descricao)){
        this.listaDeTarefas.remove(tarefa);
        break;
      }
    }
  }

  public void exibirTarefas(){
    for (Tarefa tarefa : this.listaDeTarefas) {
        System.out.println(tarefa.toString());
    }
  }

  public int contarTarefas(){
    return this.listaDeTarefas.size();
  }

  public Set<Tarefa> obterTarefasConcluidas(){
    Set<Tarefa> concluidas = new HashSet<>();
    for (Tarefa tarefa : this.listaDeTarefas) {
      if(tarefa.isConcluida()){
        concluidas.add(tarefa);
      }
    }
    return concluidas;
  }

  public Set<Tarefa> obterTarefasPendentes(){
    Set<Tarefa> pendentes = new HashSet<>();
    for (Tarefa tarefa : this.listaDeTarefas) {
      if(!tarefa.isConcluida()){
        pendentes.add(tarefa);
      }
    }
    return pendentes;
  }

  public void marcarTarefaConcluida(String descricao){
    for (Tarefa tarefa : this.listaDeTarefas) {
      if(tarefa.getDescricao().equals(descricao)){
        tarefa.setConcluida(true);
        break;
      }
    }
  }

  public void marcarTarefaPendente(String descricao){
    for (Tarefa tarefa : this.listaDeTarefas) {
      if(tarefa.getDescricao().equals(descricao)){
        tarefa.setConcluida(false);
        break;
      }
    }
  }

  public void limparListaTarefas(){
    this.listaDeTarefas.removeAll(listaDeTarefas);
  }
}

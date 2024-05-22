import java.util.ArrayList;

public class ListaDeTarefas {

  ArrayList<Tarefa> tarefas;

  public ListaDeTarefas() {
    this.tarefas = new ArrayList<Tarefa>();
  }

  // adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a
  // descrição fornecida.
  public void adicionarTarefa(String descricao) {
    Tarefa novaTarefa = new Tarefa(descricao);
    this.tarefas.add(novaTarefa);
  }

  // removerTarefa(String descricao): Remove uma tarefa da lista com base em sua
  // descrição.
  public void removerTarefa(String descricaoString) {
    for (Tarefa tarefa : this.tarefas) {
        if (tarefa.getDescricao().equals(descricaoString)) {
            this.tarefas.remove(tarefa);
            return;
        }
    }

    // Caso a tarefa não seja encontrada, exibe uma mensagem
    System.out.println("Tarefa com a descrição \"" + descricaoString + "\" não encontrada.");
}

  // obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
  public int obterNumeroTotalTarefas() {
    return this.tarefas.size();
  }

  // obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as
  // tarefas na lista
  public ArrayList<String> obterDescricoesTarefas() {
    ArrayList<String> descricoesTarefas = new ArrayList<>();
    for (Tarefa tarefa : this.tarefas) {
      String descricaoTarefa = tarefa.getDescricao();
      descricoesTarefas.add(descricaoTarefa);
    }

    return descricoesTarefas;
  }
}

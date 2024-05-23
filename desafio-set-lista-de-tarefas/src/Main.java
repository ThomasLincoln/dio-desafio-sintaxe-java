import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando algumas tarefas à lista
        listaTarefas.adicionarTarefa("Fazer compras no mercado");
        listaTarefas.adicionarTarefa("Estudar para a prova");
        listaTarefas.adicionarTarefa("Pagar as contas");

        // Exibindo todas as tarefas
        System.out.println("\nTarefas pendentes:");
        listaTarefas.exibirTarefas();

        // Marcando uma tarefa como concluída
        listaTarefas.marcarTarefaConcluida("Fazer compras no mercado");

        // Exibindo as tarefas novamente, mostrando a tarefa concluída
        System.out.println("\nTarefas após marcar uma como concluída:");
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Pagar as contas");

        // Exibindo as tarefas após a remoção
        System.out.println("\nTarefas após remover uma:");
        listaTarefas.exibirTarefas();

        // Mostrando o número de tarefas pendentes
        System.out.println("\nNúmero de tarefas pendentes: " + listaTarefas.obterTarefasPendentes().size());

        // Mostrando as tarefas concluídas
        System.out.println("\nTarefas concluídas:");
        exibirTarefas(listaTarefas.obterTarefasConcluidas());

        // Mostrando as tarefas pendentes
        System.out.println("\nTarefas pendentes:");
        exibirTarefas(listaTarefas.obterTarefasPendentes());

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();

        // Verificando se a lista está vazia
        System.out.println("\nLista de tarefas vazia? " + listaTarefas
                .contarTarefas());
    }

    private static void exibirTarefas(Set<Tarefa> tarefas) {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}

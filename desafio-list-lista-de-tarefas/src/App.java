public class App {
    public static void main(String[] args) throws Exception {
        ListaDeTarefas tarefas = new ListaDeTarefas();
        tarefas.adicionarTarefa("comer");
        tarefas.adicionarTarefa("correr");
        tarefas.adicionarTarefa("escrever");
        tarefas.adicionarTarefa("caminhar");
        System.out.println(tarefas.obterDescricoesTarefas());
        tarefas.obterNumeroTotalTarefas();
        tarefas.removerTarefa("correr");
        System.out.println(tarefas.obterDescricoesTarefas());
    }
}

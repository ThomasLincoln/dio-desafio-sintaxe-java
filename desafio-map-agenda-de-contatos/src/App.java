public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos minhaAgenda = new AgendaContatos();

        // Adicionar contatos
        minhaAgenda.adicionarContato("João", 123456789);
        minhaAgenda.adicionarContato("Maria", 987654321);
        minhaAgenda.adicionarContato("Pedro", 456123789);

        // Exibir contatos
        System.out.println("Contatos na agenda:");
        minhaAgenda.exibirContatos();

        // Pesquisar por nome
        System.out.println("\nPesquisando contato 'Maria':");
        minhaAgenda.pesquisarPorNome("Maria");

        // Remover contato
        System.out.println("\nRemovendo contato 'Pedro':");
        minhaAgenda.removerContato("Pedro");

        // Exibir contatos após remoção
        System.out.println("\nContatos na agenda após remoção:");
        minhaAgenda.exibirContatos();

        // Tentar pesquisar um contato removido
        System.out.println("\nPesquisando contato 'Pedro' (removido):");
        minhaAgenda.pesquisarPorNome("Pedro");
    }
}

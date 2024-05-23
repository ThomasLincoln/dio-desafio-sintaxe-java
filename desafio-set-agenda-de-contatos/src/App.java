import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
          // Criando uma agenda de contatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionando alguns contatos
        agendaContatos.adicionarContato("João Silva", 12345678);
        agendaContatos.adicionarContato("Maria Oliveira", 98765432);
        agendaContatos.adicionarContato("Pedro Souza", 87654321);

        // Exibindo todos os contatos
        System.out.println("Contatos na agenda:");
        agendaContatos.exibirContatos();

        // Pesquisando por um contato por nome (parcial)
        System.out.println("\nContatos com nome 'Jo':");
        Set<Contato> contatosEncontrados = agendaContatos.pesquisarPorNome("Jo");
        for (Contato contato : contatosEncontrados) {
            System.out.println(contato.toString());
        }

        // Atualizando o número de telefone de um contato
        System.out.println("\nAtualizando número de Maria Oliveira para 55555555");
        agendaContatos.atualizarNumeroContato("Maria Oliveira", 55555555);

        // Exibindo a agenda após a atualização
        System.out.println("\nContatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}

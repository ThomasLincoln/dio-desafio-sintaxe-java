import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        // Cria uma instância de AgendaEventos
        AgendaEventos agenda = new AgendaEventos();

        // Adiciona alguns eventos à agenda
        agenda.adicionarEvento(LocalDate.of(2024, 6, 15),
             "Show de Rock", "Banda XYZ");
        agenda.adicionarEvento(LocalDate.of(2024, 7, 10),
             "Festa Junina", "Quadrilha ABC");
        agenda.adicionarEvento(LocalDate.of(2024, 8, 5), 
            "Feira de Ciências", "Exposição de Invenções");
        agenda.adicionarEvento(LocalDate.of(2024, 5, 29), 
            "Palestra de Tecnologia", "Especialista em IA");

        // Exibe toda a agenda de eventos
        System.out.println("Exibindo agenda de eventos:");
        agenda.exibirAgenda();

        // Obtém e exibe o próximo evento a partir da data atual
        System.out.println("\nObtendo o próximo evento:");
        agenda.obterProximoEvento();
    }
}

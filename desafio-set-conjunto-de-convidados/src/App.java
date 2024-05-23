public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Adicionando alguns convidados
        conjuntoConvidados.adicionarConvidado("João Silva", 1234);
        conjuntoConvidados.adicionarConvidado("Maria Oliveira", 5678);
        conjuntoConvidados.adicionarConvidado("Pedro Souza", 9012);

        // Exibindo a quantidade de convidados
        System.out.println("Número de convidados: " + conjuntoConvidados.contarConvidados());

        // Exibindo a lista de convidados
        conjuntoConvidados.exibirConvidados();

        // Removendo um convidado por código de convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(5678);

        // Exibindo a quantidade de convidados após a remoção
        System.out.println("Número de convidados após remoção: " + conjuntoConvidados.contarConvidados());

        // Exibindo a lista de convidados após a remoção
        conjuntoConvidados.exibirConvidados();
    }
}

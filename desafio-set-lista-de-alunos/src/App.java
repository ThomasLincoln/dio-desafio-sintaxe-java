public class App {
    public static void main(String[] args) throws Exception {
        // Criando um objeto da classe GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alguns alunos
        gerenciadorAlunos.adicionarAluno("João", 123, 8.5);
        gerenciadorAlunos.adicionarAluno("Maria", 456, 9.2);
        gerenciadorAlunos.adicionarAluno("Pedro", 789, 7.8);

        // Exibindo alunos por nome
        System.out.println("\nAlunos por nome:");
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos por nota
        System.out.println("\nAlunos por nota:");
        gerenciadorAlunos.exibirAlunosPorNota();

        // Removendo aluno por matrícula
        System.out.println("\nRemovendo aluno com matrícula 456...");
        gerenciadorAlunos.removerAluno(456);

        // Exibindo alunos após remoção
        System.out.println("\nAlunos após remoção:");
        gerenciadorAlunos.exibirAlunos();
    }
}

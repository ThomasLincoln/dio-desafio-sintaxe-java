import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Cria uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();

        // Adiciona algumas pessoas à lista
        ordenacao.adicionarPessoa("João", 20, 1.75);
        ordenacao.adicionarPessoa("Maria", 31, 1.67);
        ordenacao.adicionarPessoa("Pedro", 18, 1.80);

        // Testa o método ordenarPorIdade()
        List<Pessoa> pessoasPorIdade = ordenacao.ordenarPorIdade();
        System.out.println("Pessoas por idade:");
        for (Pessoa pessoa : pessoasPorIdade) {
            System.out.println(pessoa);
        }

        // Testa o método ordenarPorAltura()
        List<Pessoa> pessoasPorAltura = ordenacao.ordenarPorAltura();
        System.out.println("\nPessoas por altura:");
        for (Pessoa pessoa : pessoasPorAltura) {
            System.out.println(pessoa);
        }
    }
}

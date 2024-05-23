import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();

        // Adicionando alguns números à lista
        ordenacao.adicionarNumero(5);
        ordenacao.adicionarNumero(1);
        ordenacao.adicionarNumero(3);
        ordenacao.adicionarNumero(4);
        ordenacao.adicionarNumero(2);

        // Testando o método ordenarAscendente()
        List<Integer> ordenadoAsc = ordenacao.ordenarAscendente();
        System.out.println("Lista ordenada em ordem ascendente: " + ordenadoAsc);

        // Testando o método ordenarDescendente()
        List<Integer> ordenadoDesc = ordenacao.ordenarDescendente();
        System.out.println("Lista ordenada em ordem descendente: " + ordenadoDesc);

        // Testando a exceção para lista vazia
        try {
            ordenacao.ordenarAscendente(); // Lista vazia
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());

        }
    }
}
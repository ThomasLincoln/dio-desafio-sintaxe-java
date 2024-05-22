import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        // Criar um objeto SomaNumeros
        SomaNumeros somador = new SomaNumeros();

        // Adicionar alguns números à lista
        somador.adicionarNumeros(10);
        somador.adicionarNumeros(5);
        somador.adicionarNumeros(2);
        somador.adicionarNumeros(7);
        somador.adicionarNumeros(-1);

        // Exibir a soma total dos números
        System.out.println("Soma total: " + somador.calcularSoma());

        // Exibir o maior número da lista
        System.out.println("Maior número: " + somador.encontrarMaiorNumero());

        // Exibir o menor número da lista
        System.out.println("Menor número: " + somador.encontrarMenorNumero());

        // Exibir todos os números da lista
        System.out.println("\nNúmeros na lista:");
        ArrayList<Integer> numerosExibidos = somador.exibirNumeros();
        for (Integer numero : numerosExibidos) {
            System.out.print(numero + " ");
        }
    }
}

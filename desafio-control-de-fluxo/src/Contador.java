import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contador {
	public static void main(String[] args) throws IOException {
	BufferedReader terminal = new BufferedReader(
                new InputStreamReader(System.in));
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = Integer.parseInt(terminal.readLine());
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = Integer.parseInt(terminal.readLine());
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (IllegalArgumentException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception.getMessage());
		}
		
	}

	static void contar(int parametroUm, int parametroDois) throws IllegalArgumentException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois <= parametroUm) {
			throw new IllegalArgumentException("O Segundo parâmetro deve ser maior que o primeiro");
		}
		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		for (int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + i);
			
		}
	}
}
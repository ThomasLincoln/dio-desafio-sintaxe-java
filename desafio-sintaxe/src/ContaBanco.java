import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Insira seu nome: ");
        String nomeCliente = reader.readLine();
        System.out.println("Insira o nome da sua Agência: ");
        String nomeAgencia = reader.readLine();
        System.out.println("Insira o número da sua conta: ");
        int numeroContaCliente = Integer.parseInt(reader.readLine());
        System.out.println("Informe o saldo desejado: ");
        double saldoDesejado = Double.parseDouble(reader.readLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + nomeAgencia + ", conta " + numeroContaCliente + " e seu saldo " + saldoDesejado
                + " já está disponível para saque");
    }
}

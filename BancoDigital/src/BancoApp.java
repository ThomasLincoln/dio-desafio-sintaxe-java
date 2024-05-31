public class BancoApp {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        ContaCorrente cc = new ContaCorrente("001", cliente1, 500.0);
        ContaPoupanca cp = new ContaPoupanca("002", cliente1, 0.02);

        cc.depositar(1000.0);
        cp.depositar(2000.0);

        cc.sacar(200.0);
        cp.aplicarRendimento();

        cc.transferir(cp, 300.0);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());
    }
}

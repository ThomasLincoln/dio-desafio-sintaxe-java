public class ContaPoupanca  extends Conta{
  private double taxaRendimento;

  public ContaPoupanca(String numero, Cliente cliente, double taxaRendimento) {
    super(numero, cliente);
    this.taxaRendimento = taxaRendimento;
  }

  public void aplicarRendimento() {
    double rendimento = getSaldo() * taxaRendimento;
    depositar(rendimento);
  }

}

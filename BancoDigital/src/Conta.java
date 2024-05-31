public class Conta {
  private String numero;
  private double saldo;
  private Cliente cliente;

  public Conta(String numero, Cliente cliente) {
    this.numero = numero;
    this.cliente = cliente;
    this.saldo = 0.0;
  }

  public String getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
    }
  }

  public boolean sacar(double valor) {
    if (valor > 0 && saldo >= valor) {
      saldo -= valor;
      return true;
    }
    return false;
  }

  public boolean transferir(Conta destino, double valor) {
    if (this.sacar(valor)) {
      destino.depositar(valor);
      return true;
    }
    return false;
  }
}

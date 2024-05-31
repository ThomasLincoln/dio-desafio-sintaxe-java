public class ContaCorrente extends Conta {
  private double limiteChequeEspecial;

  public ContaCorrente(String numero, Cliente cliente, double limiteChequeEspecial) {
      super(numero, cliente);
      this.limiteChequeEspecial = limiteChequeEspecial;
  }

  @Override
  public boolean sacar(double valor) {
      if (valor > 0 && getSaldo() + limiteChequeEspecial >= valor) {
          super.depositar(-valor); // Usando super para acessar métodos da classe pai
          return true;
      }
      return false;
  }
}

import java.util.ArrayList;

public class SomaNumeros {
  ArrayList<Integer> numeros;

  public SomaNumeros() {
    this.numeros = new ArrayList<Integer>();
  }

  // adicionarNumero(int numero): Adiciona um número à lista de números.
  public void adicionarNumeros(int numero) {
    this.numeros.add(numero);
  }

  // calcularSoma(): Calcula a soma de todos os números na lista e retorna o
  // resultado.
  public int calcularSoma() {
    int somaTotal = 0;
    for (Integer numeroInteger : this.numeros) {
      somaTotal += numeroInteger;
    }
    return somaTotal;
  }

  // encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
  public int encontrarMaiorNumero() {
    int maiorNumero = Integer.MIN_VALUE;
    for (Integer integer : this.numeros) {
      if (integer > maiorNumero) {
        maiorNumero = integer;
      }
    }
    return maiorNumero;
  }

  // encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
  public int encontrarMenorNumero() {
    int menorNumero = Integer.MAX_VALUE;
    for (Integer integer : this.numeros) {
      if (integer < menorNumero) {
        menorNumero = integer;
      }
    }
    return menorNumero;
  }

  // exibirNumeros(): Retorna uma lista contendo todos os números presentes na
  // lista.
  public ArrayList<Integer> exibirNumeros() {
    ArrayList<Integer> numerosExibidos = new ArrayList<>();

    // Itera pelos elementos da lista utilizando o loop for each
    for (Integer numero : this.numeros) {
      numerosExibidos.add(numero);
    }

    return numerosExibidos;
  }

}

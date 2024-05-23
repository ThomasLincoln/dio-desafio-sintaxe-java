import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  List<Integer> numeros;

  public OrdenacaoNumeros(){
    this.numeros = new ArrayList<>();
  }

  // adicionarNumero(int numero): Adiciona um número à lista.
  public void adicionarNumero(int numero){
    this.numeros.add(numero);
  }

  // ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a
  // interface Comparable e a class Collections.
  public List<Integer> ordenarAscendente(){
    List<Integer> ordenadoAsc = new ArrayList<>(numeros);
    if(!numeros.isEmpty()){
      Collections.sort(ordenadoAsc);
      return ordenadoAsc;
    }else {
      throw new RuntimeException("A lista está vazia");
    }
  }

  // ordenarDescendente(): Ordena os números da lista em ordem descendente usando
  // um Comparable e a class Collections.
  public List<Integer> ordenarDescendente(){
    List<Integer> ordenadoDesc = new ArrayList<>(numeros);
    if(!numeros.isEmpty()){
      ordenadoDesc.sort(Collections.reverseOrder());
      return ordenadoDesc;
    }else {
      throw new RuntimeException("A lista está vazia");
    }
  }

}

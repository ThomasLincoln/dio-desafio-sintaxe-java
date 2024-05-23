import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  private Set<Convidado> convidadosSet;

  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    this.convidadosSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    for (Convidado convidado : this.convidadosSet) {
      if (convidado.getCodigoConvite() == codigoConvite) {
        convidadosSet.remove(convidado);
        return;
      }
    }
  }

  public int contarConvidados() {
    return this.convidadosSet.size();
  }

  public void exibirConvidados() {
    for (Convidado convidado : this.convidadosSet) {
      System.out.println(convidado.toString());
    }
  }
}

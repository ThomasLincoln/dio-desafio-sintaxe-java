import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  private Set<Aluno> setAlunos;

  public GerenciadorAlunos() {
    this.setAlunos = new HashSet<>();
  }

  public void adicionarAluno(String nome, int matricula, double media) {
    this.setAlunos.add(new Aluno(nome, matricula, media));
  }

  // `removerAluno(long matricula)`: Remove um aluno ao conjunto a partir da
  // matricula, se estiver presente.
  public void removerAluno(int matricula) {
    Aluno alunoParaRemover = null;
    if (!setAlunos.isEmpty()) {
      for (Aluno a : setAlunos) {
        if (a.getMatricula() == matricula) {
          alunoParaRemover = a;
          break;
        }
      }
      setAlunos.remove(alunoParaRemover);
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }

    if (alunoParaRemover == null) {
      System.out.println("Matricula não encontrada!");
    }
  }

  public void exibirAlunosPorNome() {
    Set<Aluno> ordemAlfabetica = new TreeSet<>(setAlunos);
    for (Aluno aluno : ordemAlfabetica) {
      System.out.println(aluno.toString());
    }
  }

  public void exibirAlunosPorNota() {
    Set<Aluno> ordemDeNota = new TreeSet<>(new ComparatorPorNota());
    if(!setAlunos.isEmpty()){
      ordemDeNota.addAll(setAlunos);
    }
    for (Aluno aluno : ordemDeNota) {
      System.out.println(aluno.toString());
    }
  }

  public void exibirAlunos() {
    for (Aluno aluno : setAlunos) {
      System.out.println(aluno.toString());
    }
  }

}

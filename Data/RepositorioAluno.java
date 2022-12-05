package Data;

import java.util.ArrayList;

import Negocio.Aluno.Aluno;
import Negocio.Exception.AlunoNaoEncontradoException;

public class RepositorioAluno {
  private ArrayList<Aluno> alunoLista;

  public RepositorioAluno() {
    this.alunoLista = new ArrayList();
  }

  public boolean alunoExistente(int matr) {
    for (Aluno checarAluno : alunoLista) {
      if (checarAluno.getMatr() == matr) {
        return true;
      }
    }
    return false;
  }

  public void adicionarUsuario(Aluno alunoNovo) {
    if (!alunoExistente(alunoNovo.getMatr())) {
      alunoLista.add(new Aluno(alunoNovo.getNome(), alunoNovo.getSenha(), alunoNovo.getMatr()));
    }
  }

  public Aluno buscarAluno(int matr) throws Exception {
    if (!alunoExistente(matr)) {
      throw new AlunoNaoEncontradoException();
    }
    for (Aluno checarAluno : alunoLista) {
      if (checarAluno.getMatr() == matr) {
        return checarAluno;
      }

    }
    return null;
  }

  @Override
  public String toString() {
    return "GerenciarAluno [Lista de alunos cadastrados : " + alunoLista + "]";
  }

}

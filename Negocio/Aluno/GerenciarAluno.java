package Negocio.Aluno;

import java.util.ArrayList;

import Negocio.Exception.AlunoNaoEncontradoException;

public class GerenciarAluno {
  private ArrayList<Aluno> alunoLista;

  public GerenciarAluno() {
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

  public void adicionarAluno(Aluno alunoNovo) {
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

  public Aluno buscarSenhaAluno(int matr, String senha) throws Exception {
    Aluno al = new Aluno(matr, senha);
    if (buscarAluno(matr) != null) {
      if (al.compareTo(al) == 0) {
      return al;
      } else {
        return null;
      }
    }
    return null;
  }

  public void exibirAlunos() {
    System.out.println(alunoLista);
  }

  @Override
  public String toString() {
    return "[Lista de alunos cadastrados : " + alunoLista + "]";
  }

}

package Negocio.Aluno;

import Data.RepositorioAluno;

public class GerenciarAluno {
  private RepositorioAluno rAluno;

  public boolean alunoExistente(int matr) {
    return rAluno.alunoExistente(matr);
  }

  public void adicionarUsuario(Aluno alunoNovo) {
    rAluno.adicionarUsuario(alunoNovo);
  }

  public Aluno buscarAluno(int matr) throws Exception {
    return rAluno.buscarAluno(matr);
  }

  public void exibirAlunos() {
    rAluno.exibirAlunos();
  }

  public String toString() {
    return rAluno.toString();
  }
}
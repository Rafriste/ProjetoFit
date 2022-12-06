package Negocio.Aluno;

import java.util.ArrayList;

import Negocio.Exception.AlunoNaoEncontradoException;
import Negocio.Exception.SenhaNaoEncontradaException;

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

  public boolean senhaExistente(String senha) {
    for (Aluno checarSenha : alunoLista) {
      if (checarSenha.getSenha() == senha) {
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

  public Aluno buscarSenha(String senha) throws Exception {
    if (!senhaExistente(senha)) {
      throw new SenhaNaoEncontradaException();
    }
    for (Aluno checarSenha : alunoLista) {
      if (checarSenha.getSenha() == senha) {
        return checarSenha;
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

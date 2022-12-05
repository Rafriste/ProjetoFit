package Negocio;

import Negocio.Aluno.Aluno;
import Negocio.Personal.Personal;
import Negocio.Treino.Treino;

public interface IFachada {
  public void adicionarUsuario(Aluno aluno);

  public void adicionarPerso(Personal personal);

  public void adicionarTreino(Treino treino);

  public Aluno buscarAluno(int matr) throws Exception;

  public Personal buscarPersonal(int matr) throws Exception;

  public Treino buscarTreino(int matr) throws Exception;

  public void excluirTreino(Treino treino);
}
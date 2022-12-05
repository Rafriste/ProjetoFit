package Negocio;

import Negocio.Aluno.Aluno;
import Negocio.Aluno.GerenciarAluno;
import Negocio.Personal.GerenciarPersonal;
import Negocio.Personal.Personal;
import Negocio.Treino.GerenciarTreino;
import Negocio.Treino.Treino;

public class Fachada implements IFachada {
  private GerenciarAluno gAluno;
  private GerenciarPersonal gPersonal;
  private GerenciarTreino gTreino;

  public Fachada() {
    this.gAluno = new GerenciarAluno();
    this.gPersonal = new GerenciarPersonal();
    this.gTreino = new GerenciarTreino();
  }

  @Override
  public void adicionarUsuario(Aluno aluno) {
    this.gAluno.adicionarUsuario(aluno);
  }

  public void adicionarPerso(Personal personal) {
    this.gPersonal.adicionarPerso(personal);
  }

  public void adicionarTreino(Treino treino) {
    this.gTreino.adicionarTreino(treino);
  }

  @Override
  public Aluno buscarAluno(int matr) throws Exception {
    return this.gAluno.buscarAluno(matr);
  }

  public Personal buscarPersonal(int matr) throws Exception {
    return this.gPersonal.buscarPersonal(matr);
  }

  public Treino buscarTreino(int matr) throws Exception {
    return this.gTreino.buscarTreino(matr);
  }

  public void excluirTreino(Treino treino) {
    this.gTreino.excluirTreino(treino);
  }

  public String toString() {
    return gTreino.toString();
  }
}
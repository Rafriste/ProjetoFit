package Negocio;

import Negocio.Aluno.Aluno;
import Negocio.Aluno.GerenciarAluno;
import Negocio.Pesonal.GerenciarPersonal;
import Negocio.Treino.GerenciarTreino;

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

  @Override
  public Aluno buscarAluno(int matr) throws Exception {

    return this.gAluno.buscarAluno(matr);

  }

  @Override
  public void adicionarPedido(Pedido pedido) {

    gPedidos.adicionarPedido(pedido);
  }

  @Override
  public void exibirItens() {
    gDeItems.exibirItens();

  }

  @Override
  public void fecharMesa() {

    gPedidos.fecharMesa();

  }

  @Override
  public void excluirPedido(Pedido pedido) {
    // TODO Auto-generated method stub

  }

  public String toString() {

    return gPedidos.toString();
  }

  @Override
  public Pedido buscarPedido(int nPedido) throws Exception {

    return gPedidos.buscarPedido(nPedido);
  }

}
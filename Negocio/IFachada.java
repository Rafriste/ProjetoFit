package Negocio;

import Negocio.Aluno.Aluno;
import Negocio.Aluno.GerenciarAluno;
import Negocio.Treino.Treino;

public interface IFachada {
  public void adicionarUsuario(Aluno cliente);

  public Aluno buscarAluno(int matr) throws Exception;

  public void adicionarTreino(Treino pedido);

  public void exibirItens();

  public void fecharMesa();

  public void excluirPedido(Treino treino);

  public Treino buscarPedido(int nTreino) throws Exception;
}
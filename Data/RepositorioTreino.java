package Data;

import java.util.ArrayList;

import Negocio.Treino.Treino;

public class RepositorioTreino {
    private ArrayList<Treino> treinoLista;

  public RepositorioTreino() {
    this.treinoLista = new ArrayList();
  }

    public boolean treinoExistente(int matr) {
        for (Treino checarTreino : treinoLista) {
            if (checarTreino.getMatr() == matr) {
                return true;
            }
        }
        return false;
    }

    public void adicionarTreino(Treino treinoNovo) {
        if (!treinoExistente(treinoNovo.getMatr())) {
            treinoLista.add(new Aluno(treinoNovo.getMatr()));
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
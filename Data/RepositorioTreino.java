package Data;

import java.util.ArrayList;

import Negocio.Exception.TreinoNaoEncontradoException;
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
            treinoLista.add(new Treino(treinoNovo.getMatr(), treinoNovo.getTreino()));
        }
    }

    public Treino buscarTreino(int matr) throws Exception {
        if (!treinoExistente(matr)) {
            throw new TreinoNaoEncontradoException();
        }
        for (Treino checarTreino: treinoLista) {
            if (checarTreino.getMatr() == matr) {
                return checarTreino;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "GerenciarTreino [Lista de treinos cadastrados : " + treinoLista + "]";
    }

}
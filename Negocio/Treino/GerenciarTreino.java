package Negocio.Treino;

import Data.RepositorioTreino;

public class GerenciarTreino {
    private RepositorioTreino rTreino;

    public boolean treinoExistente(int matr) {
        return rTreino.treinoExistente(matr);
    }

    public void adicionarTreino(Treino treinoNovo) {
        rTreino.adicionarTreino(treinoNovo);
    }

    public Treino buscarTreino(int matr) throws Exception {
        return rTreino.buscarTreino(matr);
    }

    public void excluirTreino(Treino treinoAExcluir) {
        rTreino.excluirTreino(treinoAExcluir);
    }

    public String toString() {
        return rTreino.toString();
    }
}
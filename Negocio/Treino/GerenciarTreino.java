package Negocio.Treino;

import java.util.ArrayList;
import Negocio.Exception.TreinoNaoEncontradoException;

public class GerenciarTreino {
    private ArrayList<Treino> treinoLista;

    public GerenciarTreino() {
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

    public void excluirTreino(Treino treinoAExcluir) {
        treinoLista.remove(treinoAExcluir);
    }

    public Treino buscarTreino(int matr) throws Exception {
        if (!treinoExistente(matr)) {
            throw new TreinoNaoEncontradoException();
        }
        for (Treino checarTreino : treinoLista) {
            if (checarTreino.getMatr() == matr) {
                return checarTreino;
            }

        }
        return null;
    }

    public void exibirTreinos() {
        System.out.println(treinoLista);
    }

    @Override
    public String toString() {
        return "[Lista de treinos cadastrados : " + treinoLista + "]";
    }
}
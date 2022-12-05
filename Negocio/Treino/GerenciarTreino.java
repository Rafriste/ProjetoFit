package Negocio.Treino;

import Data.RepositorioAluno;

public class GerenciarTreino {
    public class GerenciarAluno {
        private RepositorioAluno rTreino;

        public boolean treinoExistente(int matr) {
            return rTreino.treinoExistente(matr);
        }

        public void adicionarTreino(Treino treinoNovo) {
            rTreino.adicionarTreino(treinoNovo);
        }

        public Treino buscarTreino(int matr) throws Exception {
            return rTreino.buscarTreino(matr);
        }

        public String toString() {
            return rTreino.toString();
        }
    }
}
package Negocio.Treino;

public class TreinoB extends Treino implements ITreino {

    public TreinoB(int matr, String treinoB) {
        super(matr, treinoB);
    }

    @Override
    public boolean statusDoTreino() {
        if (treinoIniciado() == true) {
            return true;
        } else {
            return false;
        }
    }
}
package Negocio.Treino;

public class TreinoA extends Treino implements ITreino {

    public TreinoA (int matr, String treinoA){
        super(matr, treinoA);
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
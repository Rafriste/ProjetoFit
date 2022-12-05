package Negocio.Treino;

public class TreinoC extends Treino implements ITreino {

    public TreinoC (int matr, String treinoC){
        super(matr, treinoC);
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
package Negocio.Personal;

import Data.RepositorioPersonal;
import Negocio.Exception.Exception;

public class GerenciarPersonal {
    private RepositorioPersonal rPersonal;

    public boolean personalExistente(int matr) {
        return rPersonal.personalExistente(matr);
    }

    public void adicionarPerso(Personal personalNovo) {
        rPersonal.adicionarPerso(personalNovo);
    }

    public Personal buscarPersonal(int matr) throws Exception {
        return rPersonal.buscarPersonal(matr);
    }

    public String toString() {
        return rPersonal.toString();
    }
}
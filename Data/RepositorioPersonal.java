package Data;

import java.util.ArrayList;

import Negocio.Pesonal.Personal;

public class RepositorioPersonal {
    private ArrayList<Personal> personalLista;

    public RepositorioPersonal() {
            this.personalLista = new ArrayList();
        }

    public boolean personalExistente(int matr) {
        for (Personal checarPersonal : personalLista) {
            if (checarPersonal.getMatr() == matr) {
                return true;
            }
        }
        return false;
    }

    public void adicionarUsuario(Personal personalNovo) {
        if (!personalExistente(personalNovo.getMatr())) {
            personalLista.add(new Personal(personalNovo.getNome(), personalNovo.getSenha(), personalNovo.getMatr()));
        }
    }

    public Personal buscarAluno(int matr) throws Exception {
        if (!personalExistente(matr)) {
            throw new PersonalNaoEncontradoException();
        }
        for (Personal checarPersonal : personalLista) {
            if (checarPersonal.getMatr() == matr) {
                return checarPersonal;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "GerenciarPersonal [Lista de personais cadastrados : " + personalLista + "]";
    }

}
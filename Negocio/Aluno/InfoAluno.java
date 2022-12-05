package Negocio.Aluno;

public abstract class InfoAluno {
    public String nome;
    public String senha;
    public int matr;

    public int getMatr() {
        return matr;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

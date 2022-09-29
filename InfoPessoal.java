public abstract class InfoPessoal {
    public String nome;
    public String senha;
    public String matr;
    
    public String getMatr() {
        return matr;
    }
    public String getNome() {
        return nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setMatr(String matr) {
        this.matr = matr;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}

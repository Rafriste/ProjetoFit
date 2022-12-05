package Negocio.Pesonal;

public class Personal {
	public String nome;
	public String senha;
	public int matr;

	public Personal(String nome, String senha, int matr) {
		this.nome = nome;
		this.senha = senha;
		this.matr = matr;
	}

	public Personal(int matr) {
		this.matr = matr;
	}

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
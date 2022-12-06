package Negocio.Aluno;

public class Aluno extends InfoAluno{
    // Atributos
	public int diasMalhado;
	
	// Construtor
	public Aluno (String nome, String senha, int matr){
		this.nome = nome;
		this.senha = senha;
		this.matr = matr;
	}

	public Aluno (int matr, String senha){
		this.senha = senha;
		this.matr = matr;
	}
	
	public Aluno (int m){
		this.matr = m;
	}

	public int compareTo(Aluno al) {
        int result;
        result = this.getSenha().compareTo(al.getSenha());
        return result;
    }
    
    public String toString () {
        return "MATRICULA: " + this.matr + " NOME: " + this.nome;
    }
}

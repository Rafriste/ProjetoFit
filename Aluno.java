public class Aluno implements Comparable <Aluno>{
    // Atributos
    private String matr;{
	public String nome;
	public String senha;

	// Construtor
	public Aluno (String nome, String senha, String matr){
		this.nome = nome;
		this.senha = senha;
		this.matr = matr;
	}
	
	public Aluno (String m){
		this.matr = m;
	}
	
	// GET e SET
	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
		
	public String getMatr() {
		return matr;
	}
	public void setMatr(String matr) {
		this.matr = matr;
	}

	public int compareTo (Aluno alu) {
        int result;
        result = this.getMatr().compareTo(al.getMatr());
        return result;
    }
    
    public String toString () {
        return this.matr + " " + this.nome;
    }

	
}
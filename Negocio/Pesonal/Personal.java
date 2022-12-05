import Negocio.Aluno.InfoPessoal;

package Negocio.Pesonal;
public class Personal extends InfoPessoal implements Comparable <Personal> {

	public int diaTrabalhado;

	public Personal(String matr, String nome, String senha){
		this.matr = matr;
		this.senha = senha;
		this.nome = nome;
	}
	public Personal(String m){
		this.matr = m;
	}
	public String getSenha() {
		return senha;
	}
	public String getMatr() {
		return matr;
	}
	public void setsenha(String senha) {
		this.senha = senha;
	}
	public void setMatr(String matr) {
		this.matr = matr;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int compareTo (Personal pers) {
        int result;
        result = this.getMatr().compareTo(pers.getMatr());
        return result;
    }
	public String toString () {
        return "MATRICULA: " + this.matr + " NOME: " + this.nome ;
    }

}

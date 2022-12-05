package Negocio.Treino;

public class Treino {
	public String treino;
	public int matr;
	public int DiaMalhado = 0;

	public Treino(int matr, String treino) {
		this.matr = matr;
		this.treino = treino;
	}

	public String getTreino() {
		return treino;
	}

	public void setTreino(String treino) {
		this.treino = treino;
	}

	public int getDiaMalhado() {
		return DiaMalhado;
	}

	public void setDiaMalhado(int diaMalhado) {
		DiaMalhado = diaMalhado;
	}

	public void diaMalhado(int DiaMalhado) {
		DiaMalhado++;
	}

	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public boolean treinoIniciado(){
		return true;
	}

}
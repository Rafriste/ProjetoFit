public class Personal extends InfoPessoal implements Comparable <Personal> {

	public Personal(String matri, String nomeP, String codigoPr){
		this.matri = matri;
		this.codigoPr = codigoPr;
		this.nomeP = nomeP;
	}
	public Personal(String m){
		this.matri = m;
	}
	public String getCodigoPr() {
		return codigoPr;
	}
	public String getMatri() {
		return matri;
	}
	public void setCodigoPr(String codigoPr) {
		this.codigoPr = codigoPr;
	}
	public void setMatri(String matri) {
		this.matri = matri;
	}
	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	public int compareTo (Personal pers) {
        int result;
        result = this.getMatri().compareTo(pers.getMatri());
        return result;
    }
	public String toString () {
        return "MATRICULA: " + this.matri + " NOME: " + this.nomeP ;
    }

}

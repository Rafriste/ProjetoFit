public class Node {
    // Atributos
    private Aluno info;
    private Personal inf;
    private Node prox;
    private Treino tr;
    // Construtor      
    public Node (Aluno valor) {
        this.info = valor;
    }     
    
    // Métodos GET e SET
    public void setInfo (Aluno valor) {
        this.info = valor;
    }

    public void setProx (Node novoProx) {
        this.prox = novoProx;
    }

    public Aluno getInfo() {
        return this.info;
    }
    
    public Node getProx() {
        return this.prox;
    }
    public Personal getInf() {
        return this.inf;
    }
    public void setInf(Personal inf) {
        this.inf = inf;
    }
    public Treino getTr() {
        return tr;
    }
    public void setTr(Treino tr) {
        this.tr = tr;
    }
}

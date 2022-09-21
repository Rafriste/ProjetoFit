public class Node {
    // Atributos
    private Aluno info;
    private Node prox;

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
}
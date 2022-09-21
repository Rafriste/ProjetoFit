import java.util.Scanner;

public class AcoesAluno {
    // Atributo
    private Node primeiro;

    // Métodos públicos
    public boolean isEmpty() { 
        // testa se a lista está vazia
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirAluno (Aluno alu) { 
        // verifica, usando o "buscar", se o aluno já é cadastrado.
        Node aux = this.primeiro;
        Node result = this.buscar(alu);
        if (result != null){
            System.out.println("Aluno já está na lista!");
        } else {
            // insere um novo aluno no final de lista de alunos
            Node novo = new Node(alu);
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                while (aux.getProx() != null){
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Inserção efetuada!");
        }
    }

    public Node buscar(Aluno alu) {
        Node aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(alu) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }
    
    public void exibir() {
        // exibe os alunos cadastrados
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
    public void alterarTreinoA (String treino) {
        Scanner in = new Scanner (System.in);
        Treino aux = new Treino (treino); 
        String novoTreino;
        Node result = this.buscar(aux);    
        System.out.print("Informe o novo treino desejado: ");
        novoTreino = in.nextLine();
        result.getInfo().setTreinoA(novoTreino);
        System.out.println("Treino alterado!");
          
    }
    public void alterarTreinoB (String treino) {
        Scanner in = new Scanner (System.in);
        Treino aux = new Treino (treino); 
        String novoTreino;
        Node result = this.buscar(aux);    
        System.out.print("Informe o novo treino desejado: ");
        novoTreino = in.nextLine();
        result.getInfo().setTreinoB(novoTreino);
        System.out.println("Treino alterado!");
          
    }
    public void alterarTreinoC (String treino) {
        Scanner in = new Scanner (System.in);
        Treino aux = new Treino (treino); 
        String novoTreino;
        Node result = this.buscar(aux);    
        System.out.print("Informe o novo treino desejado: ");
        novoTreino = in.nextLine();
        result.getInfo().setTreinoC(novoTreino);
        System.out.println("Treino alterado!");
          
    }

    public void exibirEspecifico(Aluno alu){
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (alu.getMatr() != null) {
            System.out.println(alu.getNome() + " " + alu.getMedia() + " " + alu.getFaltas());
        }
        
    }
    public void removerAluno(){
        Aluno proc = new Aluno(matr);
        Node atual, anterior;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.primeiro.getProx() == null) {
            if (proc.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                System.out.println("Remoção efetuada");
            } else {
                System.out.println("Aluno não encontrado!");
            }
        } else { // lista com mais de um nó
            if (proc.compareTo(this.primeiro.getInfo()) == 0) { // remoção do primeiro
                this.primeiro = this.primeiro.getProx();
                System.out.println("Remoção efetuada");
            } else {
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                   if (atual.getInfo().compareTo(proc) != 0 ) {
                    anterior = atual;
                    atual = atual.getProx();
                   }
                   else {
                       break; // achou!!!
                   }
                }
                if (atual == null) {
                    System.out.println("Valor não pertence a lidta!");
                }
                else {
                    anterior.setProx(atual.getProx());
                    System.out.println("Remoção efetuada!");
                }
            }
        }
    }
}
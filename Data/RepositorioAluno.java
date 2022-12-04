package Data;

public class RepositorioAluno {
    private ArrayList<Aluno> alunoLista;

    public RepositorioAluno() {
      this.alunoLista = new ArrayList();
    }

    public boolean alunoExistente(int cpf){
      for(Aluno checarAluno: alunoLista ){
        if (checarAluno.getCpf() == cpf ){
          return true;
        }
      }
      return false;
    }

    public void adicionarUsuario(Aluno alunoNovo){
      if (!alunoExistente(alunoNovo.getCpf())){
          alunoLista.add(new Aluno(alunoNovo.getNome(), alunoNovo.getCpf(), alunoNovo.getSenha()));
        }
      }

    public Aluno buscarAluno(int cpf) throws Exception {
      if (!alunoExistente(cpf)){
        throw new AlunoNaoEncontradoExepition();
      }
      for(Aluno checarAluno: alunoLista ){
        if (checarAluno.getCpf() == cpf ){

          return checarAluno;
        }

    }
      return null;
  }

    @Override
    public String toString() {
      return "GerenciarAluno [Lista de alunos cadastrados : " + alunoLista + "]";
    }

}

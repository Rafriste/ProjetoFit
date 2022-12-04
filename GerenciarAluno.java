public class GerenciarAluno {
    private RepositorioAluno rAluno;

    public boolean alunoExistente(int cpf){
     return rAluno.alunoExistente(cpf);
    }



    public void adicionarUsuario(Aluno alunoNovo){

      rAluno.adicionarUsuario(alunoNovo);

      }

    public Aluno buscarAluno(int cpf) throws Exception {

      return rAluno.buscarAluno(cpf);
  }
  public String toString() {
    return rAluno.toString();
  }

}

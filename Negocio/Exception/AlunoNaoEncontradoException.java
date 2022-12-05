package Negocio.Exception;

public class AlunoNaoEncontradoException extends Exception  {
    public AlunoNaoEncontradoException() {
        super("Aluno não encontado");
    }
}
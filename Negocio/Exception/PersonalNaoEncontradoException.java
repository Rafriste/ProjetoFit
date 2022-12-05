package Negocio.Exception;

public class PersonalNaoEncontradoException extends Exception  {
    public PersonalNaoEncontradoException() {
        super("Personal não encontrado");
    }
}
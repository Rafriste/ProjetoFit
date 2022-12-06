package Negocio.Exception;

public class SenhaNaoEncontradaException extends Exception {
    public SenhaNaoEncontradaException() {
        super("Senha não encontrada");
    }
}
import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        Botao botao1 = new Botao();

        botao1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botao1.setSize(350, 80);
        botao1.setVisible(true);
    }
}
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Botao extends JFrame {

    public Botao() {
        super();
        this.configurarFrame();
    }

    private void configurarFrame(){
        this.setTitle("janela com painel");
        this.setPreferredSize(new Dimension(500,250));
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Botao extends JFrame {

    private JPanel jpnCliente;
    private JLabel jlbNomeCliente;
    private JTextField jtfNomeCliente;

    private JPanel jpnInfo;
    private JLabel jlbInfo;

    public Botao() {
        super();
        this.configurarFrame();
        this.configurarPainelCliente();
        this.add(this.jpnCliente);

        this.configurarDadosCliente();
        this.jpnCliente.add(this.jlbNomeCliente);
        this.jpnCliente.add(this.jtfNomeCliente);

        this.configurarPainelInfo();
        this.add(this.jpnInfo);
    }

    private void configurarPainelCliente(){
        this.jpnCliente = new JPanel(new FlowLayout());
        this.jpnCliente.setPreferredSize(new Dimension(450,100));
        this.jpnCliente.setBackground(Color.YELLOW);
    }

    private void configurarDadosCliente(){
        this.jlbNomeCliente = new JLabel("Nome do Cliente:");
        this.jtfNomeCliente = new JTextField();
        this.jtfNomeCliente.setPreferredSize(new Dimension(300,25));

    }

    private void configurarPainelInfo(){
        this.jpnInfo = new JPanel(new FlowLayout());
        this.jpnInfo.setPreferredSize(new Dimension(450,50));
        this.jpnInfo.setBackground(Color.CYAN);
        this.jlbInfo = new JLabel("www.oiRafa.com.br");
        this.jpnInfo.add(this.jlbInfo);
    }

    private void configurarFrame(){
        this.setTitle("Sistema Academia");
        this.setSize(new Dimension(500,250));
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
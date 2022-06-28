package tela;

import javax.swing.*;

public class MKEndereco extends JFrame{
    private JTextField rua;
    private JTextField cidade;
    private JButton cadastrarButton;
    private JPanel mainPanel;

    public MKEndereco(){
        setContentPane(mainPanel);
        setTitle("bem vindo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        MKEndereco newframe = new MKEndereco();
    }
}

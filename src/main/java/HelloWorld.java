import javax.swing.*;

public class HelloWorld extends JFrame {
    private JLabel lblMensagem;
    private JPanel panel1;

    private JLabel lblMensagem1;
    public HelloWorld(){
        setContentPane(panel1);
        pack();
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }

}

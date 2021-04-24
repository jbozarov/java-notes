
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class Main {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;


    public Main() {
        gui();
    }

    public void gui() {
        frame = new JFrame("Window");
        frame.setVisible(true);
        frame.setSize(800, 600);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes frame when click close button

        panel = new JPanel();
        panel.setBackground(Color.YELLOW);

        button = new JButton("Test");
//        button.addActionListener();
        label = new JLabel("This is test label");

        panel.add(button);
        panel.add(label);

        frame.add(panel);

    }


    public static void main(String[] args) {
        System.out.println("DKFJDKFDJ");

        Main testMain = new Main();
    }
}

import javax.swing.*;
import java.awt.Color;
public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("color changer");
        frame.getContentPane().setBackground(Color.RED);
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        frame.add(panel);
        frame.setSize(500, 500);
        JButton button= new JButton("click me plz");
        button.setBounds(100,100,200,200);
        frame.add(button);
        frame.setLayout(null);

        frame.setVisible(true);

    }
}
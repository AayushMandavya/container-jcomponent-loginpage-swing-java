
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField tf1;
    JPasswordField pf;
    JButton b;
    Login() {
        setTitle("Login Form");
        setVisible(true);
        setSize(300, 150);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 80, 20);
        tf1 = new JTextField(20);
        tf1.setBounds(100, 20, 100, 20);
        l2 = new JLabel("Password:");
        l2.setBounds(20, 50, 80, 20);
        pf = new JPasswordField(20);
        pf.setBounds(100, 50, 100, 20);
        b = new JButton("Login");
        b.setBounds(100, 80, 80, 20);
        b.addActionListener(this);
        add(l1);
        add(tf1);
        add(l2);
        add(pf);
        add(b);
    }
    public void actionPerformed(ActionEvent e) {
        String uname = tf1.getText();
        String pass = pf.getText();
        if (uname.equals("aayush") && pass.equals("aayush12")) {
            JOptionPane.showMessageDialog(this, "Login Successful");
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect login or password");
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}


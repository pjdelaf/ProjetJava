package vue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pagedacceuil {
    private JButton validation;
    private JPanel PageDacceuil;

    public pagedacceuil() {
        validation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World");
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("pagedacceuil");
        frame.setContentPane(new pagedacceuil().PageDacceuil);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
package vue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panneaux
{
    private JPanel connexion;
    private JPanel West;
    private JPanel North;
    private JPanel East;
    private JPanel South;
    private JLabel NomDeBase;
    private JLabel Login;
    private JLabel MotDePasse;
    private JLabel LocaleADistance;
    private JTextField NomDeBasetextField;
    private JTextField LogintextField;
    private JPasswordField passwordField;
    private JRadioButton localeRadioButton;
    private JRadioButton àDistanceRadioButton;
    private JButton validationButton ;
    public JFrame frame;
    public Panneaux() {

        validationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "validation en cours ");
                Pagedaccueil pda = new Pagedaccueil();
                frame.removeAll();
                //frame.add();

            }
        });


    }
            public static void main(String[] arg)
        {
        JFrame frame = new JFrame();
        frame.setContentPane(new Panneaux().connexion);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
